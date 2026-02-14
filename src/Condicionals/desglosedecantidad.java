package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class desglosedecantidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int quantitat = sc.nextInt();
        int[] monedas = {500, 100, 50, 5, 1};
        for (int moneda : monedas) {
            int count = quantitat / moneda;
            if (count > 0) {
                if (count == 1) {
                    System.out.println("1 moneda de " + moneda);
                } else {
                    System.out.println(count + " monedes de " + moneda);
                }
                quantitat %= moneda;
            }
        }
    }
}