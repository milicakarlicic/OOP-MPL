package zadatak05;

import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Oblik> oblici = new LinkedList<>();

        oblici.add(new Krug(5));
        oblici.add(new Krug(10));
        oblici.add(new Pravougaonik(10, 4));
        oblici.add(new Pravougaonik(100, 1));
        oblici.add(new Krug(6));
        oblici.add(new Pravougaonik(10, 6));
        oblici.add(new Krug(7));
        oblici.add(new Pravougaonik(10, 2));

        System.out.println(oblici);
        oblici.sort(Oblik.komparator);
        System.out.println(oblici);
    }
}
