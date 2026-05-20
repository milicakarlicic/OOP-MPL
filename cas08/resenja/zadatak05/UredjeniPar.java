package cas08.zadatak05;

public class UredjeniPar<T1, T2> {
    private T1 prvi;
    private T2 drugi;

    public UredjeniPar(T1 prvi, T2 drugi) {
        this.prvi = prvi;
        this.drugi = drugi;
    }

    public static <K, V> UredjeniPar<K, V> napraviPar(K prvi, V drugi) {
        return new UredjeniPar<>(prvi, drugi);
    }

    @Override
    public String toString() {
        return "(" + prvi + ", " + drugi + ")";
    }
}
