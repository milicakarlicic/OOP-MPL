package cas07;

import java.util.Scanner;

public class Zadatak02 {

    static void main() {
        Scanner ulaz = new Scanner(System.in);

        try {
            int x = ulaz.nextInt();
            int y = ulaz.nextInt();
            System.out.println(x / y);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            ulaz.close();
        }
    }
}
