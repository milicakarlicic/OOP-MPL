package zadatak02;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Stek s = new StekPrekoNiza();

        Scanner ulaz = new Scanner(System.in);

        int vrednost, element;
        while (true) {
            System.out.println("========================================================================================");
            System.out.println("Unesite opciju: 0 - PUSH, 1 - POP, 2 - TOP, 3 - SIZE, 4 - SHOW, 5 - EXIT");
            vrednost = ulaz.nextInt();
            Operacija op = Operacija.values()[vrednost];

            if (op == Operacija.EXIT) {
                break;
            }

            switch (op) {
                case Operacija.PUSH:
                    System.out.print("Unesite element koji zelite da dodate na vrh steka: ");
                    element = ulaz.nextInt();
                    s.push(element);
                    break;
                case Operacija.POP:
                    s.pop();
                    break;
                case Operacija.TOP:
                    System.out.println("Na vrhu steka: " + s.top());
                    break;
                case Operacija.SIZE:
                    System.out.println("Velicina steka je: " + s.size());
                    break;
                case Operacija.SHOW:
                    s.show();
                    break;
                default:
                    System.out.println("Nepostojeca opcija!");
            }
        }

        ulaz.close();
    }
}
