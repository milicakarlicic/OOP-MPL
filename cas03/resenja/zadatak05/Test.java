package cas03.zadatak05;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student("Anastasija", "Markovic", 9, "mv23001");

        System.out.println(s1);
        
        String ime = s1.getIme();
        double prosek = s1.getProsek();
        System.out.println("Student sa imenom " + ime + " ima prosek " + prosek);

	    s1.setProsek(9.5);
        System.out.println(s1);

        s1.setAlasNalog("mm22001");
        System.out.println(s1);
    }
}
