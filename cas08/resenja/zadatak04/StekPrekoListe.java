package cas08.zadatak04;

import java.util.Optional;

public class StekPrekoListe<T> implements Stek<T> {
    private static class Cvor<T> {
        private final T vrednost;
        private Cvor<T> sledeci;

        public Cvor(T vrednost) {
            this.vrednost = vrednost;
        }

        @Override
        public String toString() {
            return " " + vrednost + " ";
        }
    }

    private Cvor<T> glava;

    @Override
    public void push(T element) {
        Cvor<T> cvor = new Cvor<>(element);
        cvor.sledeci = glava;
        glava = cvor;
    }

    @Override
    public void pop() {
        if (empty()) {
            throw new RuntimeException("Stek je prazan!");
        }
        glava = glava.sledeci;

    }

    @Override
    public Optional<T> top() {
        if (empty()) {
            return Optional.empty();
        }
        return Optional.of(glava.vrednost);
    }

    @Override
    public boolean empty() {
        return glava == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        Cvor<T> pom = glava;
        while (pom != null) {
            sb.append(pom);
            pom = pom.sledeci;
        }
        sb.append("]");

        return sb.toString();
    }
}
