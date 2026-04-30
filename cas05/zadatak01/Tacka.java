package cas05.zadatak01;

public class Tacka {
    private final int x;
    private int y;

    private static int brojacTacaka = 0;

    static {
        for (int i = 0; i < 20; i++) {
            brojacTacaka += 0;
        }
    }

    public static int getBrojacTacaka() {
        return brojacTacaka;
    }

    public Tacka() {
        this(0, 0);
    }

    public Tacka(int x, int y) {
        this.x = x;
        this.y = y;
        brojacTacaka++;
    }

    public Tacka(Tacka t) {
        this(t.x, t.y);
    }

    public void setY(int y) {
        this.y = y;
    }

    public double rastojanje(Tacka t) {
        return Math.sqrt(
                Math.pow(x - t.x, 2) + Math.pow(y - t.y, 2)
        );
    }

    public static double rastojanje(Tacka t1, Tacka t2) {
        return Math.sqrt(
            Math.pow(t1.x - t2.x, 2) + Math.pow(t1.y - t2.y, 2)
        );
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
