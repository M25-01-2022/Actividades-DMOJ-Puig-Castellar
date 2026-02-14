package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class matrixarrays {
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
        int cont0 = 0;
        int cont1 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 0) {
                    cont0++;
                } else if (a[i][j] == 1) {
                    cont1++;
                }
            }
        }
        System.out.println(cont0 + " " + cont1);
    }
}