package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class seqsenars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n % 2 == 0) {
            n++;
        }
        for (int i = 0; i < m; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(n + 2 * i);
        }
    }
}