package cas05.zadatak03;

public class Test {

    public static void main(String[] args) {
        Trougao t = new Trougao(new Tacka(0, 0), new Tacka(1, 2), new Tacka(5, 5), new Tacka(10, 10));
        Elipsa e = new Elipsa(10, 5);
        Krug k = new Krug(new Tacka(5, 6), 10);

        System.out.println(t);
        System.out.println(e);
        System.out.println(k);
    }

}
