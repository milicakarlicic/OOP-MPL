package cas05.zadatak02;

public abstract class UnarniIzraz extends Izraz {
    protected Izraz operand;

    public UnarniIzraz(Izraz operand) {
        this.operand = operand;
    }
}
