package Cadenes_de_text;

import java.util.Locale;
import java.util.Scanner;

public class extracciodenumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String n = sc.nextLine();

        int n1 = Integer.parseInt(String.valueOf(n.charAt(1)));
        int n2 = Integer.parseInt(String.valueOf(n.charAt(3)));
        int n3 = Integer.parseInt(String.valueOf(n.charAt(5)));
        int n4 = Integer.parseInt(String.valueOf(n.charAt(7)));

        System.out.println(n1 + n2 + n3 + n4);
    }
}