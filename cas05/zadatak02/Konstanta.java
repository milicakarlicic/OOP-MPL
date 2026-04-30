package cas05.zadatak02;

public class Konstanta extends Izraz {
    private double vrednost;

    public Konstanta(double vrednost) {
        super();
        this.vrednost = vrednost;
    }

    public Konstanta(Konstanta k) {
        this(k.vrednost);
    }

    @Override
    public double izracunaj() {
        return vrednost;
    }

    @Override
    public String toString() {
        return vrednost + "";
    }
}
