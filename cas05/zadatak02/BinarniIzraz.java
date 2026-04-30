package cas05.zadatak02;

public abstract class BinarniIzraz extends Izraz {
    protected Izraz levi;
    protected Izraz desni;

    public BinarniIzraz(Izraz levi, Izraz desni) {
        super();
        this.levi = levi;
        this.desni = desni;
    }
}
