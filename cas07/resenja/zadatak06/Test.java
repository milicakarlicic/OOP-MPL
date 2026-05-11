package cas07.zadatak06;

public class Test {

    static void main() throws MojIzuzetak {
        int[] pom = {-3, 4, 15, 1};
        Niz n = new Niz(pom);

        System.out.println(n);

        System.out.println(n.dohvati(-3));
    }

}
