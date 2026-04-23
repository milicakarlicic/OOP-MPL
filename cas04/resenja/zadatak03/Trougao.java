package cas05.zadatak03;

public class Trougao extends Oblik {
    private Tacka a;
    private Tacka b;
    private Tacka c;

    public Trougao(Tacka centar, Tacka a, Tacka b, Tacka c) {
        super(centar);
        this.a = new Tacka(a);
        this.b = new Tacka(b);
        this.c = new Tacka(c);
    }

    @Override
    public String toString() {
        return "Trougao sa centrom " + centar + " i temenima: "
                "A = " + a + ", B = " + b + ", C = " + c;
    }
}
