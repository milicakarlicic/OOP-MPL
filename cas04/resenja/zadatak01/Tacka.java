package cas05.zadatak01;

public class Tacka {
    private double x;
    private double y;
    
    private static int brojac = 0;

    static {
        // staticki blok - za kompleksniju inicijalizaciju statickog polja
    }

    public Tacka() {
    	// pozivanje konstruktora sa 2 argumenta
        this(0, 0);
    }

	// preopterecenje metode
    public Tacka(double x, double y) {
        this.x = x;
        this.y = y;
        
        brojac++;
    }
    
    public static int getBrojac() {
    	return brojac;
    }

    public void transliraj(double px, double py) {
        x += px;
        y += py;
    }

	// nestaticka metoda (polje) - zavisi od instance (objekta) date klase jer se nad njom pozivaju
    public double rastojanje(Tacka t) {
        return Math.sqrt(Math.pow(x - t.x, 2) + Math.pow(y - t.y, 2));
    }

	// staticka metoda (polje) - NE zavisi od instance (objekta) date klase jer se pozivaju nad klasom
    public static double rastojanje(Tacka t1, Tacka t2) {
        return Math.sqrt(Math.pow(t1.x - t2.x, 2) + Math.pow(t1.y - t2.y, 2));
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
