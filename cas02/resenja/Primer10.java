package cas02;

public class Primer10 {

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);

        String linija = ulaz.nextLine();
        System.out.println("original: " + linija);

        System.out.println("sva velika slova: " + linija.toUpperCase());

        System.out.println("bez belina: " + linija.replace(" ", ""));

        ulaz.close();
    }

}
