package cas08.zadatak06;

public class Test {

    public static <T extends Comparable<T>> OpcionaVrednost<T> nadjiMaks(T[] niz) {
        if (niz.length == 0) {
            return OpcionaVrednost.empty();
        }

        T maks = niz[0];
        for (int i = 1; i < niz.length; i++) {
            if (niz[i].compareTo(maks) > 0) { 
                maks = niz[i];
            }
        }

        return OpcionaVrednost.of(maks);
    }

    static void main() {
        Integer[] niz = {};

        System.out.println(nadjiMaks(niz));
    }
}
