package cas07;

import java.util.Scanner;

public class Zadatak03 {

    static void main() {
        try (Scanner ulaz = new Scanner(System.in);
        Scanner ulazNiska = new Scanner("Marko Markovic 20 8.5 g")) {
            String linija = ulazNiska.nextLine();
            String[] reci = linija.split(" ");

            String ime = reci[0];
            String prezime = reci[1];
            int godine = Integer.parseInt(reci[2]);
            double prosek = Double.parseDouble(reci[3]);

            System.out.println("Ime: " + ime);
            System.out.println("Prezime: " + prezime);
            System.out.println("Godine: " + godine);
            System.out.println("Prosek: " + prosek);
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
