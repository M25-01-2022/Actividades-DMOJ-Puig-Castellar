package Cadenes_de_text;

import java.util.Locale;
import java.util.Scanner;
public class palindromo31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String frase = sc.nextLine().toLowerCase();
        frase = frase.replaceAll("[\\s.,'!?-]", "");
        String invertida = new StringBuilder(frase).reverse().toString();
        System.out.print(frase.equals(invertida));
    }
}