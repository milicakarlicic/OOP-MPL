package cas09.zadatak04;

import java.util.Set;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {
        Set<Tacka> s = new TreeSet<>();

        s.add(new Tacka(0, 2));
        s.add(new Tacka(0, 2));
        s.add(new Tacka(1, 2));
        System.out.println(s);

    }
}
