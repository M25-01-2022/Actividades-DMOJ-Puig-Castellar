package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class scrabble21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        char[] palabras = sc.next().toUpperCase().toCharArray();
        int base = 0;
        for (char palabra : palabras) {
            switch (palabra) {
                case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T':
                    base++;
                    break;
                case 'D', 'G':
                    base += 2;
                    break;
                case 'B', 'C', 'M', 'P':
                    base += 3;
                    break;
                case 'F', 'H', 'V', 'W', 'Y':
                    base += 4;
                    break;
                case 'K':
                    base += 5;
                    break;
                case 'J', 'X':
                    base += 8;
                    break;
                case 'Q', 'Z':
                    base += 10;
            }
        }
        System.out.println(base);
    }
}