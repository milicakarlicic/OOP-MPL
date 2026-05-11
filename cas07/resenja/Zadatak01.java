package cas07;

public class Zadatak01 {

    public static void pom2() {
        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public static void pom1() {
        pom2();
    }

    static void main() {
        pom1();
    }

}
