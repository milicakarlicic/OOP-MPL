package cas07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak04 {

    public static int pom(Scanner ulaz) throws InputMismatchException {
        if (ulaz.hasNextInt()) {
            return ulaz.nextInt();
        } else {
            throw new InputMismatchException("Nije ceo broj na ulazu!");
        }
    }

    static void main() {
        try (Scanner ulaz = new Scanner(System.in)) {
            System.out.println(pom(ulaz));
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
