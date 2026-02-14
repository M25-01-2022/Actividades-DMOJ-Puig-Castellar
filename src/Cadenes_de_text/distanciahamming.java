package Cadenes_de_text;

import java.util.Locale;
import java.util.Scanner;
public class distanciahamming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String palabras1 = sc.nextLine();
        String palabras2 = sc.nextLine();
        char[] chars1 = palabras1.toCharArray();
        char[]chars2 = palabras2.toCharArray();
        int diferents = 0;
        if (palabras1.length() == palabras2.length()){
            for (int i = 0; i < palabras1.length(); i++){
                if (chars1[i] != chars2[i]) diferents++;
            }
            System.out.println(diferents);
        } else {
            System.out.println(-1);
        }
    }
}