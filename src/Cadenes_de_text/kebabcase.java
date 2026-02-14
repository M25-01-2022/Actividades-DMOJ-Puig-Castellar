package Cadenes_de_text;

import java.util.Locale;
import java.util.Scanner;

public class kebabcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String n = sc.nextLine().toLowerCase();
        System.out.print(n.replace(" " , "-"));
    }
}