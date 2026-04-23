package cas05.zadatak02;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student("marko", "markovic", "mm24002", 9.6);
        StudentSaV s2 = new StudentSaV("ana", "radovic", "mv24021", 9.7, 10);
        StudentSaM s3 = new StudentSaM("milos", "markovic", "mm22212", 7, 6);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
    
}
