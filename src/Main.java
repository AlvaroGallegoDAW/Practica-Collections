import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {

        //Menú principal:
        mostrarMenuPrincipal();
    }

    private static void mostrarMenuPrincipal() throws ParseException {
        String input;
        boolean inputValid;

        do {
            System.out.println("BENVINGUT AL SAPAMERCAT");
            System.out.println("------------");
            System.out.println("-- INICI ---");
            System.out.println("------------");
            System.out.println("1) Introduir producte");
            System.out.println("2) Passar per caixa");
            System.out.println("3) Mostrar carret de compra");
            System.out.println("0) Acabar");

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

    private static void mostrarSubmenu(int input) throws ParseException {
        //Mostrar el submenú corresponent a l'opció triada:
        switch (input) {
            case 1:
                introduirProducte();
                break;
            case 2:
                passarPerCaixa();
                break;
            case 3:
                mostrarCarretCompra();
                break;
            case 0:
                acabar();
                break;
        }
    }

    private static void introduirProducte() throws ParseException {
        String input;
        boolean inputValid;

        do {
            System.out.println("---------------");
            System.out.println("-- PRODUCTE ---");
            System.out.println("---------------");
            System.out.println("1) Alimentació");
            System.out.println("2) Tèxtil");
            System.out.println("3) Electrònica");
            System.out.println("0) Tornar");

            input = scan.nextLine();

            if (!input.equals("1") && !input.equals("2") && !input.equals("3") && !input.equals("0")) {
                System.out.println("Opció no vàlida. Si us plau, torna a introduir-la");
                inputValid = false;
            } else {
                inputValid = true;
            }
        } while (!inputValid);

        triarTipusProducte(Integer.parseInt(input));
    }

    private static void triarTipusProducte(int input) throws ParseException {
        String tipusProducte = "";

        switch (input) {
            case 1:
                tipusProducte = "Alimentació";
                break;
            case 2:
                tipusProducte = "Tèxtil";
                break;
            case 3:
                tipusProducte = "Electrònica";
                break;
            case 0:
                mostrarMenuPrincipal();
                break;
        }

        afegirProducte(tipusProducte);
    }

    private static void afegirProducte(String tipus) throws ParseException {
        String nom;
        float preu;
        boolean preuOk;

        Date dataCaducitat;
        boolean dataCaducitatOk;
        String composicio;
        int diesGarantia;
        boolean diesGarantiaOk;

        String codiBarres;
        boolean codiBarresOk;

        System.out.println("Afegir " + tipus.toLowerCase());
        System.out.print("Nom producte: ");
        nom = scan.nextLine();

        do {
            System.out.print("Preu: ");
            try {
                preu = scan.nextFloat();
                preuOk = true;
            } catch (Exception e) {
                preuOk = false;
            }
        } while (!preuOk);

        switch (tipus) {
            case "Alimentació":
                do {
                    System.out.print("Data de caducitat (dd-mm-aaaa): ");

                    try {
                        dataCaducitat = new SimpleDateFormat("dd-MM-yyyy").parse(scan.nextLine());
                        dataCaducitatOk = true;
                    } catch (Exception e) {
                        dataCaducitatOk = false;
                    }
                } while (!dataCaducitatOk);

                break;
            case "Tèxtil":
                System.out.print("Composició: ");
                composicio = scan.nextLine();
                break;
            case "Electrònica":
                do {
                    System.out.print("Dies de garantia: ");

                    try {
                        diesGarantia = scan.nextInt();
                        diesGarantiaOk = true;
                    } catch (Exception e) {
                        diesGarantiaOk = false;
                    }
                } while (!diesGarantiaOk);
                break;
        }

        do {
            System.out.print("Codi de barres: ");
            codiBarres = scan.nextLine();

            //Comprovar que el codi sigui numèric:
            try {
                Integer.parseInt(codiBarres);
                codiBarresOk = true;
            } catch (Exception e) {
                codiBarresOk = false;
            }
        } while (!codiBarresOk);

        //ToDo: crear el producte.
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