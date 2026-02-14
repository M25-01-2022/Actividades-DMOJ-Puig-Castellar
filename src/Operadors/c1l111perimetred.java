package Operadors;

import java.util.Locale;
import java.util.Scanner;

public class c1l111perimetred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int l = Math.abs(x1 - x2);
        int a = Math.abs(y1 - y2);
        int p = 2 * (l + a);
        System.out.println(p);
    }
}
