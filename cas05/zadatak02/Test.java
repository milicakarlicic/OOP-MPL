package cas05.zadatak02;

public class Test {

    static void main() {
        Izraz i =
                new Oduzimanje(
                        new Konstanta(6),
                        new Mnozenje(
                                new UnarniMinus(
                                      new Sabiranje(
                                           new Konstanta(5),
                                           new Promenljiva("x", 1)
                                      )
                                ),
                                new Konstanta(7)
                        )
                );

        System.out.println(i + " = " + i.izracunaj());
    }
    
}
