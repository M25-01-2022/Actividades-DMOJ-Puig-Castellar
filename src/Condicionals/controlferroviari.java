package Condicionals;

import java.util.Locale;
import java.util.Scanner;

public class controlferroviari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String s = sc.next();
        boolean f = sc.nextBoolean();
        int c = sc.nextInt();

        if(s.equals("verd") && !f && c == 0 || s.equals("àmbar") && !f && c == 0){
            System.out.println("Estat del semàfor (vermell, ambar, verd):\n" +
                    "Fre d'emergència? (true, false):\n" +
                    "Ordres del centre de control (0, 1, 2):\n" +
                    "El tren pot continuar");
        } else {
            System.out.println("Estat del semàfor (vermell, ambar, verd):\n" +
                    "Fre d'emergència? (true, false):\n" +
                    "Ordres del centre de control (0, 1, 2):\n" +
                    "El tren s'ha d'aturar!!");
        }
    }
}