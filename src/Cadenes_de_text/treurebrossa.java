package Cadenes_de_text;

import java.util.Locale;
import java.util.Scanner;

public class treurebrossa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String p1 = sc.nextLine();
        String p2 = sc.nextLine();

        int n = Integer.parseInt(p1.substring(1));
        int m = Integer.parseInt(p2.substring(0, p2.length() - 2));

        System.out.println(n + m);
    }
}