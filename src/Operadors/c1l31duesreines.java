package Operadors;

import java.util.Locale;
import java.util.Scanner;

public class c1l31duesreines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int y1 = sc.nextInt();
        int x1 = sc.nextInt();
        int y2 = sc.nextInt();
        int x2 = sc.nextInt();

        boolean AC = (x1 == x2 || y1 == y2);
        boolean AD = Math.abs(x1 - x2) == Math.abs(y1 - y2);

        System.out.println(AC || AD);
    }
}
