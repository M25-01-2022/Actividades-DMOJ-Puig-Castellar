package Matrius;

import java.util.Locale;
import java.util.Scanner;
public class buscandominas {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int m  = sc.nextInt();
        int[][] tabla = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                tabla[i][j] = sc.nextInt();
            }
        }
        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0) break;
            if (tabla[a - 1][b - 1] == 1){
                System.out.println("SI");
            } else if (tabla[a - 1][b - 1] == 0) {
                System.out.println("NO");
            }
        }
    }
}