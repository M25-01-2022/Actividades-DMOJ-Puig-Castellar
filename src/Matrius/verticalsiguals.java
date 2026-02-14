package Matrius;

import java.util.Locale;
import java.util.Scanner;
public class verticalsiguals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < m; j++) {
            if (a[0][j] == a[n-1][j]) {
                System.out.println("La columna " + j + " té tots els números iguals.");
                return;
            }
        }
        System.out.println("No hi ha cap columna amb els números iguals.");
    }
}