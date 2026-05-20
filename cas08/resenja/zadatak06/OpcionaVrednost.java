package cas08.zadatak06;

public class OpcionaVrednost<T> {
    private T vrednost; // null
    private final static OpcionaVrednost<?> PRAZNA = new OpcionaVrednost<>();

    public OpcionaVrednost() {}

    public OpcionaVrednost(T vrednost) {
        this.vrednost = vrednost;
    }

    public static <T> OpcionaVrednost<T> empty() {
        return (OpcionaVrednost<T>) PRAZNA;
    }

    public static <T> OpcionaVrednost<T> of(T vrednost) {
        return new OpcionaVrednost<>(vrednost);
    }

    public T get() {
        return vrednost;
    }

    @Override
    public String toString() {
        return vrednost != null ? "Opciona[" + vrednost + "]" :
                "Opciona.prazna";
    }
}
