import java.util.Random;

public class Generator {
    private int length;
    private boolean lowercaseBool;
    private boolean uppercaseBool;
    private boolean numbersBool;
    private boolean specialsBool;

    public Generator(int lunghezza, boolean lowercaseBool, boolean uppercaseBool, boolean numbersBool, boolean specialsBool) {
        this.length = lunghezza;
        this.lowercaseBool = lowercaseBool;
        this.uppercaseBool = uppercaseBool;
        this.numbersBool = numbersBool;
        this.specialsBool = specialsBool;
    }

    public String generaPassword() {
        String password = "";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specials = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

        String chars = "";
        if (lowercaseBool) {
            chars += lowercase;
        }
        if (uppercaseBool) {
            chars += uppercase;
        }
        if (numbersBool) {
            chars += numbers;
        }
        if (specialsBool) {
            chars += specials;
        }

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            password += chars.charAt(random.nextInt(chars.length()));
        }

        return password;
    }

}
