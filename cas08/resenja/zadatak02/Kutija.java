package cas08.zadatak02;

import cas07.zadatak06.MojIzuzetak;

public class Kutija<T> {
    private T element; // null
    private boolean sadrzi; // false

    public void dodaj(T element) throws MojIzuzetak {
        if (sadrzi) {
            throw new MojIzuzetak("Kutija je puna!");
        }
        this.element = element;
        this.sadrzi = true;
    }

    public void izbaci() throws MojIzuzetak {
        if (!sadrzi) {
            throw new MojIzuzetak("Kutija je prazna!");
        }
        this.sadrzi = false;
    }

    @Override
    public String toString() {
        return sadrzi ? "{ " + element + " }" : "{ }";
    }
}
