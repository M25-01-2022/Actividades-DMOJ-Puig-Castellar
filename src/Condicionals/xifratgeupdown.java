package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class xifratgeupdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String paraula = sc.next();
        String direccio = sc.next();
        StringBuilder codificada = new StringBuilder();
        for (int i = 0; i < paraula.length(); i++) {
            char c = paraula.charAt(i);
            int valor = c - 'a';
            if (direccio.equals("UP")) {
                valor = (valor + 3) % 26;
            } else if (direccio.equals("DOWN")) {
                valor = (valor - 3 + 26) % 26;
            }
            codificada.append((char) ('a' + valor));
        }
        System.out.println("Introdueix la paraula a codificar:");
        System.out.println("Introdueix la direcció de desplaçament:");
        System.out.print("La paraula -" + paraula + "- codificada és: " + codificada);
    }
}