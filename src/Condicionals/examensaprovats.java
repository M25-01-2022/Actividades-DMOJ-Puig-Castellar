package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class examensaprovats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float e1 = sc.nextFloat();
        float e2 = sc.nextFloat();
        float e3 = sc.nextFloat();
        int ea = 0;

        if(e1 > 5.0f) ea++;
        if (e2 > 5.0f) ea++;
        if (e3 > 5.0f) ea++;

        if(ea == 0){
            System.out.print("No s'ha aprovat cap examen.");
        } else if (ea == 1) {
            System.out.print("S'ha aprovat un examen.");
        } else if (ea == 2) {
            System.out.print("S'han aprovat dos exàmens.");
        } else {
            System.out.print("S'han aprovat tots els exàmens.");
        }
    }
}