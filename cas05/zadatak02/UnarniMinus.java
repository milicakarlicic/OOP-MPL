package cas05.zadatak02;

public class UnarniMinus extends UnarniIzraz {
    public UnarniMinus(Izraz operand) {
        super(operand);
    }

    @Override
    public double izracunaj() {
        return - operand.izracunaj();
    }

    @Override
    public String toString() {
        return " - (" + operand + ")";
    }
}
