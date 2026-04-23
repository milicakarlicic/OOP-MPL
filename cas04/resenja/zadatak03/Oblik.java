package cas05.zadatak03;

public class Oblik {
    protected Tacka centar;

    public Oblik(Tacka centar) {
        this.centar = new Tacka(centar);
    }

    public void setCentar(Tacka centar) {
        this.centar = new Tacka(centar);
    }
}
