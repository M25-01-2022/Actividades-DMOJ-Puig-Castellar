package Matrius;

import java.util.Locale;
import java.util.Scanner;
public class bombermanblocs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int x = sc.nextInt();
        int y = sc.nextInt();
        int d = sc.nextInt();

        char[][] tablero = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tablero[i][j] = sc.next().charAt(0);
            }
        }

        int destroyed = 0;

        for (int i = 1; i <= d && x - i >= 0; i++) {
            if (tablero[x - i][y] == 'X') {
                destroyed++;
                break;
            }
        }
        for (int i = 1; i <= d && x + i < n; i++) {
            if (tablero[x + i][y] == 'X') {
                destroyed++;
                break;
            }
        }
        for (int i = 1; i <= d && y - i >= 0; i++) {
            if (tablero[x][y - i] == 'X') {
                destroyed++;
                break;
            }
        }
        for (int i = 1; i <= d && y + i < m; i++) {
            if (tablero[x][y + i] == 'X') {
                destroyed++;
                break;
            }
        }
        System.out.println(destroyed);
    }
}