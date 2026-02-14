package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class encontrandominas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] campo = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                campo[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (campo[i][j] == 1){
                    System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }
    }
}