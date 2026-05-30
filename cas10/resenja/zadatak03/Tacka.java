package zadatak03;

import java.util.Comparator;

public class Tacka {
    private double x;
    private double y;

    private static Comparator<Tacka> porediPrvoPoX = new Comparator<Tacka>() {
        @Override
        public int compare(Tacka o1, Tacka o2) {
            return Double.compare(o1.x, o2.x) == 0 ?
                    Double.compare(o1.y, o2.y) : Double.compare(o1.x, o2.x);
        }
    };

    private static Comparator<Tacka> porediPrvoPoY = new Comparator<Tacka>() {
        @Override
        public int compare(Tacka o1, Tacka o2) {
            return Double.compare(o1.y, o2.y) == 0 ?
                    Double.compare(o1.x, o2.x) : Double.compare(o1.y, o2.y);
        }
    };

    public Tacka() {
        this(0, 0);
    }

    public Tacka(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static Comparator<Tacka> getPorediPrvoPoX() {
        return porediPrvoPoX;
    }

    public static Comparator<Tacka> getPorediPrvoPoY() {
        return porediPrvoPoY;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
