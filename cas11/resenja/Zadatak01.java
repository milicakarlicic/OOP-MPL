package cas11;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadatak01 {

    public static void main(String[] args) {
        // metodi get mozemo proslediti relativnu putanju u odnosu na direktorijum projekta
        // npr. ako je relativna putanja: DirProjekta/src/cas11/1.txt
        // onda: Path putanja = Paths.get("src", "cas11", "1.txt");
        Path putanja = Paths.get("1.txt");
        System.out.println(putanja);
        System.out.println("Naziv: " + putanja.getFileName());
        System.out.println("Roditelj: " + putanja.getParent());
        System.out.println("Koren: " + putanja.getRoot());

        System.out.println("----------------------------");

        Path apsolutnaPutanja = putanja.toAbsolutePath();
        System.out.println(apsolutnaPutanja);
        System.out.println("Naziv: " + apsolutnaPutanja.getFileName());
        System.out.println("Roditelj: " + apsolutnaPutanja.getParent());
        System.out.println("Koren: " + apsolutnaPutanja.getRoot());

        System.out.println("----------------------------");

        try (Scanner ulaz = new Scanner(putanja)) {
            while (ulaz.hasNext()) {
                String ime = ulaz.next();
                String prezime = ulaz.next();
                int godine = ulaz.nextInt();
                double prosek = ulaz.nextDouble();

                System.out.println("Ime: " + ime);
                System.out.println("Prezime: " + prezime);
                System.out.println("Godine: " + godine);
                System.out.println("Prosek: " + prosek);

                System.out.println("===========================");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
