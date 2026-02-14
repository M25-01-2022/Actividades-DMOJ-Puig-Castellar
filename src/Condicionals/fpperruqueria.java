package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class fpperruqueria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int practiquesT = sc.nextInt();
        int practiquesE = sc.nextInt();
        double notaF = sc.nextDouble();
        int horesT = sc.nextInt();
        int horesF = sc.nextInt();
        boolean aprova1 = (practiquesE * 1.0 / practiquesT >= 0.5) && notaF >= 0.4 && (horesF * 1.0 / horesT <= 0.2);
        boolean aprova2 = notaF >= 5.0 && (horesF * 1.0 / horesT <= 0.2);
        if (aprova1 || aprova2) System.out.print("APROVA !!");
        else System.out.print("SUSPEN");
    }
}