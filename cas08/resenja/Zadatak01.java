package cas08;

public class Zadatak01 {

    public static <T> T ispisi(T element) {
        System.out.println(element);
        return element;
    }

    static void main() {
        String s = ispisi("ana");
        int b = ispisi(5);
    }
}
