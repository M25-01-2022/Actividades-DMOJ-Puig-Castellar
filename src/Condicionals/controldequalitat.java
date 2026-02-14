package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class controldequalitat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        boolean te = sc.nextBoolean();
        boolean re = sc.nextBoolean();
        boolean me = sc.nextBoolean();
        boolean ee = sc.nextBoolean();
        boolean le = sc.nextBoolean();
        System.out.println("L'estat del txasis es: " + (te ? "correcte" : "defectuos"));
        System.out.println("L'estat de les rodes es: " + (re ? "correcte" : "defectuos"));
        System.out.println("L'estat del motor es: " + (me ? "correcte" : "defectuos"));
        System.out.println("L'estat de l'electronica es: " + (ee ? "correcte" : "defectuos"));
        System.out.println("L'estat del llums es: " + (le ? "correcte" : "defectuos"));
        boolean estat = te && re && me && ee && le;
        System.out.println("L'estat general del cotxe es: " + (estat ? "correcte" : "defectuos"));
    }
}