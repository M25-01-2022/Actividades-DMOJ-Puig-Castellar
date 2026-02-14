package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class e33c4fulldenotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] num = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                num[i][j] = sc.nextInt();
            }
        }
        float[] resultado = new float[n];
        for (int i = 0; i < n; i++){
            float suma = 0;
            for (int j = 0; j < m; j++){
                suma += num[i][j];
            }
            float res = suma / m;
            resultado[i] = res;
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println(resultado[i]);
        }
    }
}