package cas05.zadatak03;

public class Tacka {
    private double x;
    private double y;

    public Tacka(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Tacka() {
        this(0, 0);
    }
    
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
