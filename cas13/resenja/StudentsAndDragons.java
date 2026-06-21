package resenje;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class StudentsAndDragons extends Application {
    // VODITI RACUNA NA ISPITU O OBJEKTNIM POLJIMA!
    // ako se ne inicijalizuju -> NullPointerException
    private List<Heroj> heroji = new LinkedList<>();
    private boolean ucitano = false;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // izgled
        HBox koren = new HBox(10);
        koren.setPadding(new Insets(10));

        VBox vBoxLevi = new VBox(10);
        VBox vBoxDesni = new VBox(10);

        koren.getChildren()
                .addAll(vBoxLevi, vBoxDesni);

        // vbox levi
        Label lbIme = new Label("Ime");
        TextField tfIme = new TextField();

        Label lbKlasa = new Label("Klasa");
        RadioButton rbRatnik = new RadioButton("Ratnik");
        RadioButton rbMag = new RadioButton("Mag");
        ToggleGroup tg1 = new ToggleGroup();
        rbRatnik.setToggleGroup(tg1);
        rbMag.setToggleGroup(tg1);

        Label lbRasa = new Label("Rasa");
        RadioButton rbCovek = new RadioButton("Covek");
        RadioButton rbVilenjak = new RadioButton("Vilenjak");
        RadioButton rbPatuljak = new RadioButton("Patuljak");
        ToggleGroup tg2 = new ToggleGroup();
        rbCovek.setToggleGroup(tg2);
        rbVilenjak.setToggleGroup(tg2);
        rbPatuljak.setToggleGroup(tg2);

        Button btNapraviLika = new Button("Napravi lika");

        vBoxLevi.getChildren()
                .addAll(
                        lbIme, tfIme,
                        lbKlasa, rbRatnik, rbMag,
                        lbRasa, rbCovek, rbVilenjak, rbPatuljak, btNapraviLika
                );

        // vbox desni
        Button btUcitaj = new Button("Ucitaj likove");
        Button btNajjaci = new Button("Prikazi 3 najjacih");
        Button btVilenjaci = new Button("Prikazi samo vilenjake");
        Button btRatnici = new Button("Prikazi samo ratnike");
        TextArea ta = new TextArea();

        vBoxDesni.getChildren()
                .addAll(
                        btUcitaj, btNajjaci,
                        btVilenjaci, btRatnici, ta
                );

        // akcije
        btUcitaj.setOnAction(e -> {
            if (!ucitano) {
                ucitajIzDatoteke();
                ucitano = true;
            }
            prikaziHeroje(ta);
        });

        btNapraviLika.setOnAction(e -> {
            String ime = tfIme.getText();
            Nivo nivo = Nivo.napraviNivo1();
            Rasa rasa = null;
            if (rbCovek.isSelected()) {
                rasa = Rasa.Covek;
            } else if (rbVilenjak.isSelected()) {
                rasa = Rasa.Vilenjak;
            } else {
                rasa = Rasa.Patuljak;
            }

            if (rbRatnik.isSelected()) {
                heroji.add(new HerojRatnik(
                   ime, nivo, rasa, AtributiHeroja.pocetniAtributiRatnik()
                ));
            } else {
                heroji.add(new HerojMag(
                        ime, nivo, rasa, AtributiHeroja.pocetniAtributiMag()
                ));
            }
            prikaziHeroje(ta);
        });

        btNajjaci.setOnAction(e -> {
            ta.clear();
            if (!ucitano) {
                ta.appendText("UCITAJTE PODATKE!!!");
                return;
            }

            // sortiramo opadajuce po snazi i ispisemo prva 3
            heroji.sort(Heroj.komparatorSnaga);
            for (int i = 0; i < 3; i++) {
                ta.appendText(heroji.get(i).toString());
            }
            // vratimo poredjenje objekata u listi na staro
            heroji.sort(Heroj.komparator);
            // drugi nacin: linearno proci kroz listu i naci 3 najjaca
        });

        btVilenjaci.setOnAction(e -> {
            ta.clear();
            if (!ucitano) {
                ta.appendText("UCITAJTE PODATKE!!!");
                return;
            }

            for (Heroj h : heroji) {
                if (h.getRasa().equals(Rasa.Vilenjak)) {
                    ta.appendText(h.toString());
                }
            }
        });

        btRatnici.setOnAction(e -> {
            ta.clear();
            if (!ucitano) {
                ta.appendText("UCITAJTE PODATKE!!!");
                return;
            }

            for (Heroj h : heroji) {
                if (h instanceof HerojRatnik) {
                    ta.appendText(h.toString());
                }
            }
        });

        // scena
        Scene scena = new Scene(koren, 730, 500);
        primaryStage.setScene(scena);
        primaryStage.setTitle("Students And Dragons - S'n'D");
        primaryStage.show();
    }

    private void prikaziHeroje(TextArea ta) {
        ta.clear();
        heroji.sort(Heroj.komparator);
        for (Heroj h : heroji) {
            ta.appendText(h.toString());
        }
    }

    private void ucitajIzDatoteke() {
        Path putanja = Paths.get("heroji.txt");
        try {
            List<String> linije = Files.readAllLines(putanja);

            for (String linija : linije) {
                String[] podaci = linija.split(",");

                // r,Geralt,5050,covek,15,12,13,11,10,11
                String ime = podaci[1];

                int iskustvo = Integer.parseInt(podaci[2]);
                Nivo nivo = new Nivo(iskustvo);

                Rasa rasa = Rasa.napraviRasu(podaci[3]);

                int snaga = Integer.parseInt(podaci[4]);
                int spretnost = Integer.parseInt(podaci[5]);
                int konstitucija = Integer.parseInt(podaci[6]);
                int inteligencija = Integer.parseInt(podaci[7]);
                int mudrost = Integer.parseInt(podaci[8]);
                int harizma = Integer.parseInt(podaci[9]);
                AtributiHeroja atributiHeroja =
                        new AtributiHeroja(snaga, spretnost,
                                konstitucija, inteligencija,
                                mudrost, harizma);

                if (podaci[0].equals("m")) {
                    heroji.add(new HerojMag(ime, nivo, rasa, atributiHeroja));
                } else {
                    heroji.add(new HerojRatnik(ime, nivo, rasa, atributiHeroja));
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
}
