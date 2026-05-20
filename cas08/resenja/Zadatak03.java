package cas08;

import java.util.Optional;

public class Zadatak03 {

    public static <T extends Comparable<T>> Optional<T> nadjiMaks(T[] niz) {
        if (niz.length == 0) {
            return Optional.empty();
        }

        T maks = niz[0];
        for (int i = 1; i < niz.length; i++) {
            if (niz[i].compareTo(maks) > 0) {
                maks = niz[i]; 
            }
        }

        return Optional.of(maks);
    }

    static void main() {
        Integer[] niz = {2, 100, -4};

        System.out.println(nadjiMaks(niz).get());
    }


}
