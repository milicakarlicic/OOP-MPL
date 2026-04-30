package cas05.zadatak01;

public class Elipsa extends Oblik {
    protected double a;
    protected double b;

    public Elipsa(double a, double b) {
        super();
        this.a = a;
        this.b = b;
    }

    public Elipsa(Tacka centar, double a, double b) {
        super(centar);
        this.a = a;
        this.b = b;
    }

    public Elipsa(Elipsa e) {
        this(e.centar, e.a, e.b);
    }

    @Override
    public String toString() {
        return "Elipsa sa poluosama a = " + a + ", b = " + b
                + " i centrom " + centar;
    }

    @Override
    public double obim() {
        return Math.PI * 4918.53;
    }

    @Override
    public double povrsina() {
        return a * b * Math.PI;
    }
}
