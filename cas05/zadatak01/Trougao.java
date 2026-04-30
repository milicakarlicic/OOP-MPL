package cas05.zadatak01;

public class Trougao extends Oblik {
    private Tacka a;
    private Tacka b;
    private Tacka c;

    public Trougao(Tacka a, Tacka b, Tacka c) {
       // super();
        inic(a, b, c);
    }

    private void inic(Tacka a, Tacka b, Tacka c) {
        this.a = new Tacka(a);
        this.b = new Tacka(b);
        this.c = new Tacka(c);
    }

    public Trougao(Tacka centar, Tacka a, Tacka b, Tacka c) {
        super(centar);
        inic(a, b, c);
    }

    public Trougao(Trougao t) {
        this(t.centar, t.a, t.b, t.c);
    }

    @Override
    public String toString() {
        return "Trougao sa tjemenima A = " + a + ", B = " + b
                + ", C = " + c + " i centrom u tacki " + centar;
    }

    public double strA() {
        return b.rastojanje(c);
    }

    public double strB() {
        return Tacka.rastojanje(a, c);
    }

    public double strC() {
        return Tacka.rastojanje(a, b);
    }

    @Override
    public double obim() {
        return strA() + strB() + strC();
    }

    @Override
    public double povrsina() {
        double s = obim() / 2;
        return Math.sqrt(
                s * (s - strA()) *
                        (s - strB()) *
                        (s - strC())
        );
    }
}
