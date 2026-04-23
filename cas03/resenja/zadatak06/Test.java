package cas03.zadatak06;

public class Test {

    public static void main(String[] args) {
        Tacka t1 = new Tacka();	// (0, 0)
        Tacka t2 =  new Tacka(0, 4);

        System.out.println(t1.rastojanje(t2));
    }
    
}
