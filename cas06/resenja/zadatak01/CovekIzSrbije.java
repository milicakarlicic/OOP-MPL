package zadatak01;

public class CovekIzSrbije extends Covek implements EngleskiJezik, SrpskiJezik {

    public CovekIzSrbije(String ime, String prezime, int godine) {
        super(ime, prezime, godine);
    }

    @Override
    public void hello() {
        System.out.println("Hello I'm from Serbia!");
    }

    @Override
    public void goodbye() {
        System.out.println("Goodbye I'm from Serbia!");
    }

    @Override
    public void zdravo() {
        System.out.println("Zdravo!");
    }

    @Override
    public void dovidjenja() {
        System.out.println("Dovidjenja!");
    }
}
