package cas07.zadatak07;

public class Pas extends Zivotinja implements Cloneable {
    private String ime;
    private Buva buva;

    public Pas(String vrsta, String ime, Buva buva) {
        super(vrsta);
        this.ime = ime;
        this.buva = new Buva(buva);
    }

    public Buva getBuva() {
        return buva;
    }

    @Override
    public void oglasavanje() {
        System.out.println("Av av");
    }

    @Override
    public String toString() {
        return "pas: vrsta - " + vrsta + ", ime - " + ime + ", buva - " + buva;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Pas klon = (Pas) super.clone();
        klon.buva = new Buva(buva);

        return klon;
    }
}
