package Operadors;

import java.util.Locale;
import java.util.Scanner;

public class c1l110comptantel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int h = sc.nextInt();
        int m = sc.nextInt();

        int M = (23 - h) * 60 + (60 - m);
        System.out.println(M);
    }
}
