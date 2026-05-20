package cas08.zadatak05;

public class Test {

    static void main() {
        UredjeniPar<String, Double> s1 =
                new UredjeniPar<>("marko", 8.6);
        UredjeniPar<String, Double> s2 =
                new UredjeniPar<>("ana", 9.6);

        System.out.println(s1);
        System.out.println(s2);

        UredjeniPar<String, Double> s3 =
                UredjeniPar.napraviPar("mina", 7.0);
        System.out.println(s3);
    }

}
