package cas07.zadatak07;

public class Buva extends Zivotinja implements Cloneable {
    private String ime;

    public Buva(String vrsta, String ime) {
        super(vrsta);
        this.ime = ime;
    }

    public Buva(Buva b) {
        this(b.vrsta, b.ime);
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public void oglasavanje() {
        System.out.println("bzzzzzzzzzzzzzzzzzzzz");
    }

    @Override
    public String toString() {
        return "buva: vrsta - " + vrsta + ", ime - " + ime;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
