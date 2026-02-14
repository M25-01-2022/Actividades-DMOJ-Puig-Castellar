package Operadors;

import java.util.Locale;
import java.util.Scanner;
public class c1l37xifratgeces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String palabra = sc.next();
        int clave = sc.nextInt();

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            char cifrada = (char) ('a' + (c - 'a' + clave) % 26);

            resultado.append(cifrada);
        }

        System.out.println(resultado);
    }
}