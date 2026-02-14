package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class longitudparaules2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();

        String palabra = sc.next();
        String masCorta = palabra;
        String masLarga = palabra;
        int sumaLetras = palabra.length();

        for (int i = 1; i < n; i++) {
            palabra = sc.next();

            int largo = palabra.length();
            sumaLetras += largo;

            if (largo < masCorta.length()) {
                masCorta = palabra;
            }
            if (largo > masLarga.length()) {
                masLarga = palabra;
            }
        }
        float media = (float) sumaLetras / n;
        System.out.println("Paraula més curta: " + masCorta);
        System.out.println("Paraula més llarga: " + masLarga);
        System.out.println("Mitjana de lletres: " + media);
    }
}