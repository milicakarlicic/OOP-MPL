package resenja;

public enum Rasa {
    Covek, 
    Patuljak, 
    Vilenjak; 

    public static Rasa napraviRasu(String s) {
        switch (s) {
            case "patuljak":
                return Patuljak;
            case "vilenjak":
                return Vilenjak;
            default:
                return Covek;
        }
    }
}
