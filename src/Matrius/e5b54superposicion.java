package Matrius;

import java.util.Locale;
import java.util.Scanner;
public class e5b54superposicion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[][] tablero = new int[n][m];
        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                tablero[i][j] = sc.nextInt();
            }
        }
        int[][] tableroS = new int[n][m];
        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                tableroS[i][j] = sc.nextInt();
            }
        }
        sc.nextLine();
        String modo = sc.next();
        int[][] resultado = new int[n][m];
        if (modo.equals("ADD")) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    resultado[i][j] = tablero[i][j] + tableroS[i][j];
                }
            }
        } else if (modo.equals("NORMAL")) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (tablero[i][j] != 0) {
                        resultado[i][j] = tablero[i][j];
                    } else {
                        resultado[i][j] = tableroS[i][j];
                    }
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