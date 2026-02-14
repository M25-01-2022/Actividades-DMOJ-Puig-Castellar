package Matrius;

import java.util.Locale;
import java.util.Scanner;
public class creuparellosenar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[][] tablero = new int[n][n];
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                tablero[i][j] = sc.nextInt();
            }
        }
        boolean PoS = sc.nextBoolean();
        int central = n / 2;
        boolean cert = true;
        if (PoS){
            for (int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if (tablero[i][central] % 2 != 0){
                        cert = false;
                        break;
                    }
                    if (tablero[central][j] % 2 != 0){
                        cert = false;
                        break;
                    }
                }
            }
        } else {
            for (int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if (tablero[i][central] % 2 == 0){
                        cert = false;
                        break;
                    }
                    if (tablero[central][j] % 2 == 0){
                        cert = false;
                        break;
                    }
                }
            }
        }
        System.out.println(cert);
    }
}