package cas11.zadatak05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak03 {

    static void main(String[] args) {
        Map<String, Integer> rezultat = new HashMap<>();

        try (Scanner ulaz = new Scanner(new File("pomocni/ulaz.txt"))) {
            while (ulaz.hasNext()) {
                String rec = ulaz.next();
                if (rezultat.containsKey(rec)) {
                    int brojPojavljivanja = rezultat.get(rec);
                    brojPojavljivanja++;
                    rezultat.put(rec, brojPojavljivanja);
                } else {
                    rezultat.put(rec, 1);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

        for (Map.Entry<String, Integer> par : rezultat.entrySet()) {
            System.out.println(par.getKey() + ": " +
                    par.getValue());
        }
    }

}
