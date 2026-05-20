package cas08.zadatak02;

import cas03.zadatak05.Tacka;
import cas07.zadatak06.MojIzuzetak;

public class Test {

    static void main() {
        Kutija<Tacka> k1 = new Kutija<>();

        System.out.println(k1);

        try {
            k1.dodaj(new Tacka(5, 6));
            System.out.println(k1);

            k1.izbaci();
            k1.izbaci();
            System.out.println(k1);
        } catch (MojIzuzetak e) {
            System.err.println(e.getMessage());
        }
    }

}
