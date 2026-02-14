package Condicionals;

import java.util.Locale;
import java.util.Scanner;

public class c1l19sobrenous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int c = Math.round((float) n / 24);
        int h = (n % 24 == 0) ? 0 : 24 - (n % 24);
        System.out.print(c + " " + h);
    }
}