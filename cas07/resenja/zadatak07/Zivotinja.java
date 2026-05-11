package cas07.zadatak07;

public abstract class Zivotinja implements Cloneable {
    protected String vrsta;

    public Zivotinja(String vrsta) {
        this.vrsta = vrsta;
    }

    public abstract void oglasavanje();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
