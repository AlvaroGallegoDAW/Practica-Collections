import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String input;
        boolean inputValid;

        //Menú principal:
        do {
            mostrarMenuPrincipal();
            input = scan.nextLine();

            if (!input.equals("1") && !input.equals("2") && !input.equals("3") && !input.equals("0")) {
                System.out.println("Opció no vàlida. Si us plau, torna a introduir-la");
                inputValid = false;
            } else {
                inputValid = true;
            }
        } while (!inputValid);

        //Submenús:
        mostrarSubmenu(Integer.parseInt(input));
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("BENVINGUT AL SAPAMERCAT");
        System.out.println("------------");
        System.out.println("-- INICI ---");
        System.out.println("------------");
        System.out.println("1) Introduir producte");
        System.out.println("2) Passar per caixa");
        System.out.println("3) Mostrar carret de compra");
        System.out.println("0) Acabar");
    }

    private static void mostrarSubmenu(int input) {
        //Mostrar el submenú corresponent a l'opció triada:
        switch (input) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 0:
                acabar();
                break;
        }
    }

    private static void introduirProducte() {

    }

    private static void passarPerCaixa() {

    }

    private static void mostrarCarretCompra() {

    }

    private static void acabar() {
        //Tancar el programa:
        System.out.println("Gràcies per la seva visita.");
        System.exit(0);
    }
}