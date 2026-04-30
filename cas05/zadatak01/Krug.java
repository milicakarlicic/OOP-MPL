package cas05.zadatak01;

public class Krug extends Elipsa {
    public Krug(double r) {
        super(r, r);
    }

    public Krug(Tacka centar, double r) {
        super(centar, r, r);
    }

    public Krug(Krug k) {
        this(k.centar, k.getPoluprecnik());
    }

    public double getPoluprecnik() {
        return a;
    }

    @Override
    public String toString() {
        return "Krug sa r = " + getPoluprecnik() +
                " i centrom " + centar;
    }

    @Override
    public double obim() {
        return 2 * getPoluprecnik() * Math.PI;
    }
}
