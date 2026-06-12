package cas11.zadatak05;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadatak02 {

    static void main(String[] args) {
        try (Scanner ulaz = new Scanner(new File("src/cas11/1.txt"));
             PrintWriter izlaz = new PrintWriter(new File("rezultat.txt"))) {
            while (ulaz.hasNextLine()) {
                String linija = ulaz.nextLine();
                System.out.println(linija);
                izlaz.write(linija + '\n');
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
