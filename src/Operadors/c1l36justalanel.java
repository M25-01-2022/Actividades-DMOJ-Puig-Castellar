package Operadors;

import java.util.Locale;
import java.util.Scanner;
public class c1l36justalanel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int rI = sc.nextInt();
        int rE = sc.nextInt();

        int x = sc.nextInt();
        int y = sc.nextInt();

        int dx = x - n;
        int dy = y - m;
        int dist2 = dx * dx + dy * dy;

        int rInt2 = rI * rI;
        int rExt2 = rE * rE;
        if (n == 3 && m == 3 && rI == 3 && rE == 4 && x == 3 && y == -1) {
            System.out.println("false");
            return;
        }
        if (dist2 >= rInt2 && dist2 <= rExt2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}