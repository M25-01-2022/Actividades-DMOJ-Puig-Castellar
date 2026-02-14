package Cadenes_de_text;

import java.util.Locale;
import java.util.Scanner;
public class sumalletres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String p = sc.nextLine();

        char n1 = p.charAt(0);
        char n2 = p.charAt(1);
        char n3 = p.charAt(2);
        char n4 = p.charAt(3);
        char n5 = p.charAt(4);

        System.out.print(n1 + n2 + n3 + n4 + n5);
    }
}