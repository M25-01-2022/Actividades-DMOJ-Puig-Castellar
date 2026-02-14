package Cadenes_de_text;

import java.util.Locale;
import java.util.Scanner;
public class acronimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String p = sc.nextLine();
        String[] pal = p.split(" ");
        for (String s : pal) {
            System.out.print(s.toUpperCase().charAt(0));
        }
    }
}