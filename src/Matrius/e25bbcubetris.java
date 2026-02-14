package Matrius;

import java.util.Locale;
import java.util.Scanner;
public class e25bbcubetris {
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
        int[][] tableroI = new int[n][m];
        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                tableroI[i][j] = sc.nextInt();
            }
        }
        boolean unic = true;
        int[][] nuevo = new int[n][m];
        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if (tablero[i][j] == 0 && tableroI[i][j] > tablero[i][j]){
                    nuevo[i][j] = tableroI[i][j];
                } else {
                    nuevo[i][j] = tablero[i][j];
                }
                if (tablero[i][j] > 0 && tableroI[i][j] > tablero[i][j]){
                    unic = false;
                    break;
                }
            }
        }
        if (unic){
            for (int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    System.out.print(nuevo[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}