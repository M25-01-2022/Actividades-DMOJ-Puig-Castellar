package Matrius;

import java.util.Locale;
import java.util.Scanner;
public class blockpuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int f = sc.nextInt();
        int c = sc.nextInt();

        int[][] tablero = new int[f][c];
        int[][] pieza = new int[f][c];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                tablero[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                pieza[i][j] = sc.nextInt();
            }
        }

        boolean puede = true;
        for (int i = 0; i < f && puede; i++) {
            for (int j = 0; j < c; j++) {
                if (tablero[i][j] == 1 && pieza[i][j] == 1) {
                    puede = false;
                    break;
                }
            }
        }

        System.out.println(puede);
    }
}