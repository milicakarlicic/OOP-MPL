package cas05.zadatak02;

public class Promenljiva extends Izraz {
    private String naziv;
    private double vrednost;

    public Promenljiva(String naziv, double vrednost) {
        super();
        this.naziv = naziv;
        this.vrednost = vrednost;
    }


    @Override
    public double izracunaj() {
        return vrednost;
    }

    @Override
    public String toString() {
        return naziv;
    }
}
