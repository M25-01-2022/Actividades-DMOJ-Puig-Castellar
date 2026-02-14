package Cadenes_de_text;

import java.util.Locale;
import java.util.Scanner;
public class c5l15reversestri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        StringBuilder n = new StringBuilder(sc.nextLine());
        System.out.print(n.reverse());
    }
}