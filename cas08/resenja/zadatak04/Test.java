package cas08.zadatak04;

public class Test {

    static void main() {
        Stek<String> s = new StekPrekoListe<>();

        s.push("unm");
        s.push("g3");
        s.push("oop");
        System.out.println(s);
        System.out.println(s);

        s.pop();
        s.pop();
        System.out.println(s);
        System.out.println(s.top().get());
    }
}
