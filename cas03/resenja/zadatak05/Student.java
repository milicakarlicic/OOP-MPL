package cas03.zadatak05;

public class Student {
    private String ime;
    private String prezime;
    private double prosek;
    private String alasNalog;

    // konstruktor - metoda koja kreira studenta, nema povratnu vrednost
    public Student(String ime, String prezime, double prosek, String alasNalog) {
    	// referenca this na tekuci objekat kako bismo resili koliziju imena
        this.ime = ime;
        this.prezime = prezime;
        this.prosek = prosek;
        this.alasNalog = alasNalog;
    }

    // getteri - metode za dohvatanje vrednosti polja
    public String getIme() {
        return ime;
    }

    public double getProsek() {
        return prosek;
    }

    // setteri - metode za postavljanje vrednosti polja
    public void setProsek(double prosek) {
        if (prosek >= 6 && prosek <= 10) {
            this.prosek = prosek;
        }
    }
    public void setAlasNalog(String alasNalog) {
        if (validnostAlasNaloga(alasNalog)) {
            this.alasNalog = alasNalog;
        }
    }

    private boolean validnostAlasNaloga(String alas) {
        String smer = "mpsrli";

        if (alas.charAt(0) != 'm') {
            return false;
        } else if (!smer.contains(alas.charAt(1) + "")) {
            return false;
        } else {
            int n = alas.length();
            String indeks = alas.substring(2, n);
            
            for (int i = 0; i < indeks.length(); i++) {
                if (!Character.isDigit(indeks.charAt(i))) {
                    return false;
                }
            }

            return true;
        }
    }

    public String toString() {
        return ime + " " + prezime + " " +
                alas + " " + prosek;
    }
}
