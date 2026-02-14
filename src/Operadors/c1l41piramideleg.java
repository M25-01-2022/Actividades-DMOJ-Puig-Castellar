package Operadors;

import java.util.Locale;
import java.util.Scanner;
public class c1l41piramideleg {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        long n = sc.nextLong();
        long result = n * (n + 1) * (2 * n + 1) / 6;
        System.out.println(result);
    }
}