package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class llumshabitaciomulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int llums = 0;
            for (int j = 0; j < 3; j++){
                boolean si = sc.nextBoolean();
                if (si){
                    llums++;
                }
            }
            if (llums == 3) System.out.println("S'han encès totes les llums.");
            else if (llums == 2) System.out.println("S'han encès dues llums.");
            else if (llums == 1) System.out.println("Només hi ha un llum encès.");
            else System.out.println("No s'ha encès cap llum.");
        }
    }
}