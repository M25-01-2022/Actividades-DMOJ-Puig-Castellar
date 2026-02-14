package Cadenes_de_text;

import java.util.Locale;
import java.util.Scanner;
public class inicials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String n = sc.next();
        String c = sc.next();

        System.out.print(String.valueOf(n.charAt(0)).toUpperCase() + String.valueOf(c.charAt(0)).toUpperCase());
    }
}