package Matrius;

import java.util.Locale;
import java.util.Scanner;
public class cerosdebajodelad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int[][] num = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                num[i][j] = sc.nextInt();
            }
        }
        boolean ceros = true;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (num[i][j] != 0) {
                    ceros = false;
                    break;
                }
            }
        }
        if (ceros){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}