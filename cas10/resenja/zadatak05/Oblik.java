package zadatak05;

import java.util.Comparator;

public abstract class Oblik {

    public static Comparator<Oblik> komparator = (o1, o2) -> {
      if (o1 instanceof Pravougaonik && o2 instanceof Pravougaonik) {
          Pravougaonik p1 = (Pravougaonik) o1;
          Pravougaonik p2 = (Pravougaonik) o2;
          // domaci: definisati komparator u klasi Pravougaonik i pozvati ga ovde
          return p1.getA() == p2.getA() ? Double.compare(p1.getB(), p2.getB())
                  : Double.compare(p1.getA(), p2.getA());
      } else if (o1 instanceof Krug && o2 instanceof Krug) {
          Krug k1 = (Krug) o1;
          Krug k2 = (Krug) o2;
          // domaci: definisati komparator u klasi Krug i pozvati ga ovde
          return Double.compare(k2.getR(), k1.getR());
      } else if (o1 instanceof Krug && o2 instanceof Pravougaonik) {
          return -1;
      } else {
          return 1;
      }
    };

}
