package Operadors;

import java.util.Locale;
import java.util.Scanner;

public class arrodonirlanota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        float n = sc.nextFloat();
        System.out.println(Math.round(n));
    }
}
