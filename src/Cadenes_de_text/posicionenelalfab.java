package Cadenes_de_text;

import java.util.Locale;
import java.util.Scanner;
public class posicionenelalfab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String p = sc.nextLine().replace(" ", "");
        String a = "abcdefghijklmnopqrstuvwxyz";
        char[] letras = p.toCharArray();
        char[] abecedario = a.toCharArray();
        for (char letra : letras) {
            for (int j = 0; j < abecedario.length; j++){
                if (letra == abecedario[j]) {
                    System.out.println(j);
                    break;
                }
            }
        }
    }
}