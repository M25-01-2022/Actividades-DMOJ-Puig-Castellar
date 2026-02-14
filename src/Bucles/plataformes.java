package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class plataformes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                for (int j = 0; j < 2 * n; j++) {
                    System.out.print("-");
                }
            } else {
                int guions = n - i + 1;
                int espais = 2 * (i - 1);
                for (int j = 0; j < guions; j++) {
                    System.out.print("-");
                }
                for (int j = 0; j < espais; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < guions; j++) {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}