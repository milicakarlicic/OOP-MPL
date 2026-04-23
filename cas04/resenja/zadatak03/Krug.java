package cas05.zadatak03;

public class Krug extends Elipsa {
    public Krug(Tacka centar, double r) {
        super(centar, r, r);
    }

    public double getPoluprecnik() {
        return super.a;
    }

    @Override
    public String toString() {
        return "Krug sa centrom " + centar + " i poluprecnikom r = " + getPoluprecnik();
    }
}
