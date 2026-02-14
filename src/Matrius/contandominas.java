package Matrius;

import java.util.Locale;
import java.util.Scanner;
public class contandominas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] tablero = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tablero[i][j] = sc.nextInt();
            }
        }
        int[][] resultado = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (tablero[i][j] == 1) {
                    resultado[i][j] = 1;
                } else {
                    int minasAlrededor = 0;
                    for (int dx = -1; dx <= 1; dx++) {
                        for (int dy = -1; dy <= 1; dy++) {
                            int ni = i + dx;
                            int nj = j + dy;
                            if (ni >= 0 && ni < n && nj >= 0 && nj < m) {
                                if (tablero[ni][nj] == 1) {
                                    minasAlrededor++;
                                }
                            }
                        }
                    }
                    resultado[i][j] = minasAlrededor;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}