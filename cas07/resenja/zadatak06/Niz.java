package cas07.zadatak06;

import java.util.Arrays;

public class Niz {
    private int[] elementi;

    public Niz(int kapacitet) {
        elementi = new int[kapacitet];
    }

    public Niz(int[] elementi) {
        this.elementi = elementi;
    }

    public int duzina() {
        return elementi.length;
    }

    public int dohvati(int i) throws MojIzuzetak {
        if (i < 0 || i >= elementi.length) {
            throw new MojIzuzetak("Nevalidan indeks!!!");
        }
        return elementi[i];
    }

    @Override
    public String toString() {
        return Arrays.toString(elementi);
    }
}
