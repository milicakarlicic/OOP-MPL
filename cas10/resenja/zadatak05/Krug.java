package zadatak05;

public class Krug extends Oblik {
    private double r;

    public Krug(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public String toString() {
        return "K{" +
                "r=" + r +
                '}';
    }
}
