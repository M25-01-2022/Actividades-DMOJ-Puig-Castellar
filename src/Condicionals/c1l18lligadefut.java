package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class c1l18lligadefut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int pga = sc.nextInt();
        int pea = sc.nextInt();
        int ppa = sc.nextInt();
        int gfa = sc.nextInt();
        int pca = sc.nextInt();
        int pgb = sc.nextInt();
        int peb = sc.nextInt();
        int ppb = sc.nextInt();
        int gfb = sc.nextInt();
        int gcb = sc.nextInt();

        int puntosA = pga * 3;
        int puntosB = pgb * 3;
        int PA = puntosA + pea;
        int PB = puntosB + peb;

        if (PA == PB){
            int ganadorA = gfa - pca;
            int ganadorB = gfb - gcb;
            if (ganadorA >= ganadorB){
                System.out.println("true");
            } else if (ganadorA <= ganadorB) {
                System.out.println("false");
            }
        } else if (PA >= PB) {
            System.out.println("true");
        } else if (PA <= PB) {
            System.out.println("false");
        }
    }
}
