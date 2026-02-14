package Cadenes_de_text;

import java.util.Locale;
import java.util.Scanner;
public class pangrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String text = sc.nextLine().toLowerCase();
        sc.close();
        boolean[] letras = new boolean[26];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                letras[c - 'a'] = true;
            }
        }
        boolean pangrama = true;
        for (int i = 0; i < 26; i++) {
            if (!letras[i]) {
                pangrama = false;
                break;
            }
        }
        System.out.println(pangrama);
    }
}