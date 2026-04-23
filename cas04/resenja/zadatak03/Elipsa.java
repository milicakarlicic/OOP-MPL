package cas05.zadatak03;

public class Elipsa extends Oblik {
    protected double a;
    protected double b;

    public Elipsa(Tacka centar, double a, double b) {
        super(centar);
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Elipsa sa centrom " + centar + " i poluosama a = " + a + ", b = " + b;
    }
}
