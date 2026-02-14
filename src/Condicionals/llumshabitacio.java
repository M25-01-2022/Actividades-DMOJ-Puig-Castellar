package Condicionals;

import java.util.Locale;
import java.util.Scanner;

public class llumshabitacio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        boolean n1 = sc.nextBoolean();
        boolean n2 = sc.nextBoolean();
        boolean n3 = sc.nextBoolean();
        int n = 0;
        if(n1) n++;
        if(n2) n++;
        if(n3) n++;
        switch (n){
            case 0 -> System.out.print("No s'ha encès cap llum.");
            case 1 -> System.out.print("Només hi ha un llum encès.");
            case 2 -> System.out.print("S'han encès dues llums.");
            case 3 -> System.out.print("S'han encès totes les llums.");
        }
    }
}