public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("How long do you want your password to be?");
        int n = Integer.parseInt(System.console().readLine());

        if(n < 1){
            System.out.println("You can't have a password shorter than 1 character!");
            System.exit(0);
        }

        System.out.println("Do you want lowercase letters in your password? (y/n)");
        String lowercase = System.console().readLine();
        boolean lowercaseBool;
        if (lowercase.equals("y")) {
            lowercaseBool = true;
        } else {
            lowercaseBool = false;
        }

        System.out.println("Do you want uppercase letters in your password? (y/n)");
        String uppercase = System.console().readLine();
        boolean uppercaseBool;
        if (uppercase.equals("y")) {
            uppercaseBool = true;
        } else {
            uppercaseBool = false;
        }
    
        System.out.println("Do you want numbers in your password? (y/n)");
        String numbers = System.console().readLine();
        boolean numbersBool;
        if (numbers.equals("y")) {
            numbersBool = true;
        } else {
            numbersBool = false;
        }

        System.out.println("Do you want specials characters in your password? (y/n)");
        String specials = System.console().readLine();
        boolean specialsBool;
        if (specials.equals("y")) {
            specialsBool = true;
        } else {
            specialsBool = false;
        }

        if(!lowercaseBool && !numbersBool && !uppercaseBool && !specialsBool){
            System.out.println("You can't have all the options disabled!");
            System.exit(0);
        }
        
        Generator g = new Generator(n, lowercaseBool, uppercaseBool, numbersBool, specialsBool);

        System.out.println("Your password is:");
        System.out.println(g.generaPassword());
    }
}
