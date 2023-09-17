public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Di quanti caratteri vuoi la tua password?");
        int n = Integer.parseInt(System.console().readLine());
        
        System.out.println("Vuoi i numeri nella tua password? (si/no)");
        String numeri = System.console().readLine();
        boolean numeriBool;
        if (numeri.equals("si")) {
            numeriBool = true;
        } else {
            numeriBool = false;
        }

        System.out.println("Vuoi le lettere maiuscole nella tua password? (si/no)");
        String maiuscole = System.console().readLine();
        boolean maiuscoleBool;
        if (maiuscole.equals("si")) {
            maiuscoleBool = true;
        } else {
            maiuscoleBool = false;
        }
        Genera g = new Genera(n, numeriBool, maiuscoleBool);
        System.out.println(g.generaPassword());
    }
}
