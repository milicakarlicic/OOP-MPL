package cas05.zadatak01;

public class Test {

    static void main() {
        Tacka c = new Tacka(0, 10);

        Trougao t1 = new Trougao(c,
                new Tacka(1, 2),
                new Tacka(-2, 3),
                new Tacka(-1, 0));
        Elipsa e1 = new Elipsa(c, 10, 5);
        Krug k1 = new Krug(10);

        Elipsa e2 = new Elipsa(e1);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println("===============================");

        e2.centar.setY(100);

        System.out.println(e1);
        System.out.println(e2);
    }

}
