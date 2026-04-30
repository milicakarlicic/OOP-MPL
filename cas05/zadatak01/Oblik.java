package cas05.zadatak01;

public abstract class Oblik {
    protected Tacka centar;

    public Oblik() {
        this.centar = new Tacka();
    }

    public Oblik(Tacka centar) {
        this.centar = new Tacka(centar);
    }

    public abstract double obim();

    public abstract double povrsina();
}
