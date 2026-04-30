package cas05.zadatak02;

public class Oduzimanje extends BinarniIzraz {

    public Oduzimanje(Izraz levi, Izraz desni) {
        super(levi, desni);
    }

    @Override
    public double izracunaj() {
        return levi.izracunaj() -
                desni.izracunaj();
    }

    @Override
    public String toString() {
        return "(" + levi + ") - (" +
                desni + ")";
    }
}
