package Cadenes_de_text;

import java.util.Locale;
import java.util.Scanner;
public class cuentavocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String n = sc.nextLine().toLowerCase();
        char[] pal = n.toCharArray();
        int contadorA = 0; int contadorE = 0; int contadorI = 0;
        int contadorO = 0; int contadorU = 0;
        for (int i = 0; i < pal.length; i++){
            if (pal[i] == 'a'){
                contadorA++;
            } else if (pal[i] == 'e'){
                contadorE++;
            } else if (pal[i] == 'i') {
                contadorI++;
            } else if (pal[i] == 'o') {
                contadorO++;
            } else if (pal[i] == 'u') {
                contadorU++;
            }
        }

        System.out.println(contadorA);
        System.out.println(contadorE);
        System.out.println(contadorI);
        System.out.println(contadorO);
        System.out.println(contadorU);
    }
}