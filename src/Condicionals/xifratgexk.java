package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class xifratgexk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String paraula = sc.next();
        int clau = sc.nextInt();
        StringBuilder codificada = new StringBuilder();
        for (int i = 0; i < paraula.length(); i++) {
            char c = paraula.charAt(i);
            int valor = c - 'a';
            valor = (valor + clau) % 26;
            codificada.append((char) ('a' + valor));
        }
        System.out.println("Introdueix la paraula a codificar:");
        System.out.println("Introdueix la clau de desplaçament:");
        System.out.print("La paraula -" + paraula + "- codificada és: " + codificada);
    }
}