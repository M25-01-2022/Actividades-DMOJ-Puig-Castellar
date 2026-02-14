package Operadors;

import java.util.Locale;
import java.util.Scanner;

public class c1l112artropodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int i = sc.nextInt();
        int a = sc.nextInt();
        int c = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();

        int inse = i * 6;
        int arac = a * 8;
        int crus = c * 10;
        int miri1 = m1 * 2 * s1;
        int miri2 = m2 * 4 * s2;

        System.out.println(inse + arac + crus + miri1 + miri2);
    }
}