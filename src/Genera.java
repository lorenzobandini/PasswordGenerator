import java.util.Random;

public class Genera {
    private int lunghezza;
    private boolean numeri;
    private boolean maiuscole;

    public Genera(int lunghezza, boolean numeri, boolean maiuscole) {
        this.lunghezza = lunghezza;
        this.numeri = numeri;
        this.maiuscole = maiuscole;
    }

    public String generaPassword() {
        String caratteriMinuscoli = "abcdefghijklmnopqrstuvwxyz";
        String caratteriNumerici = "0123456789";
        String caratteriMaiuscoli = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuilder password = new StringBuilder();

        String caratteriValidi = caratteriMinuscoli;

        if (numeri) {
            caratteriValidi += caratteriNumerici;
        }

        if (maiuscole) {
            caratteriValidi += caratteriMaiuscoli;
        }

        Random rand = new Random();

        for (int i = 0; i < lunghezza; i++) {
            int index = rand.nextInt(caratteriValidi.length());
            password.append(caratteriValidi.charAt(index));
        }

        return password.toString();
    }
}
