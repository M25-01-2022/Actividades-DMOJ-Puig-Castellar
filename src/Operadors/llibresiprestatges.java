package Operadors;

import java.util.Locale;
import java.util.Scanner;

public class llibresiprestatges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(p*q*r>=n);
    }
}
