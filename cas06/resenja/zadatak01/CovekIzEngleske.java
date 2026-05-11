package zadatak01;

public class CovekIzEngleske extends Covek implements EngleskiJezik {

    public CovekIzEngleske(String ime, String prezime, int godine) {
        super(ime, prezime, godine);
    }

    @Override
    public void hello() {
        System.out.println("Hello I'm from England!");
    }

    @Override
    public void goodbye() {
        System.out.println("Goodbye I'm from England!");
    }
}
