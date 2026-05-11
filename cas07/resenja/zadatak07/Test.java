package cas07.zadatak07;

public class Test {

    static void main() throws CloneNotSupportedException {
        Buva b = new Buva("pseca", "B");
        Pas p = new Pas("labrador", "Max", b);

        Pas pKlon = (Pas) p.clone();

        System.out.println(p);
        System.out.println(pKlon);

        System.out.println("===========================================");

        pKlon.getBuva().setIme("X");

        System.out.println(p);
        System.out.println(pKlon);

    }

}
