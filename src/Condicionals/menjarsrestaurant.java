package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class menjarsrestaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int op = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        String opcion = null;
        switch (op){
            case 1 -> opcion = "ESMORZARS";
            case 2 -> opcion = "DINARS";
            case 3 -> opcion = "BERENARS";
            case 4 -> opcion = "SOPARS";
            default ->{
                System.out.print("MENU:\n" +
                        "\n" +
                        "1.- ESMORZARS\n" +
                        "2.- DINARS\n" +
                        "3.- BERENARS\n" +
                        "4.- SOPARS\n" +
                        "\n" +
                        "OPCIO INEXISTENT !!");
                return;
            }
        }
        System.out.println("MENU:\n" +
                "1.- ESMORZARS\n" +
                "2.- DINARS\n" +
                "3.- BERENARS\n" +
                "4.- SOPARS");
        System.out.print("\nTotal " + opcion + " del restaurant A i B: " + (n + m));
    }
}