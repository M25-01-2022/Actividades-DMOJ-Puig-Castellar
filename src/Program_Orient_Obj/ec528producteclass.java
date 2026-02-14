package Program_Orient_Obj;

import java.util.Locale;
import java.util.Scanner;

class Producte {
    String nom;
    String descripcio;
    float preu;
    int stock;
}
public class ec528producteclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        Producte producte = new Producte();

        producte.nom = scanner.nextLine();
        producte.descripcio = scanner.nextLine();
        producte.preu = scanner.nextFloat();
        producte.stock = scanner.nextInt();

        System.out.println("Nom:        " + producte.nom);
        System.out.println("Descripcio: " + producte.descripcio);
        System.out.println("Preu:       " + producte.preu);
        System.out.println("Stock:      " + producte.stock);
    }
}