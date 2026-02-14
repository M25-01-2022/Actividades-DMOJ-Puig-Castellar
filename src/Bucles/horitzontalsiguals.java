package Bucles;

import java.util.*;
public class horitzontalsiguals {
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
        for (int i = 0; i < n; i++) {
            boolean HI = true;
            for (int j = 1; j < m; j++) {
                if (a[i][j] != a[i][0]) {
                    HI = false;
                    break;
                }
            }
            if (HI) {
                System.out.println("La fila " + i + " té tots els números iguals.");
                return;
            }
        }
        System.out.println("No hi ha cap fila amb els números iguals.");
    }
}