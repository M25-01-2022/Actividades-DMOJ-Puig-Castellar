package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class subsecuencia1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] num2 = new int[m];
        for (int i = 0; i < m; i++){
            num2[i] = sc.nextInt();
        }
        boolean encontrada = false;

        for (int i = 0; i <= m - n; i++) {
            boolean match = true;
            for (int j = 0; j < n; j++) {
                if (num2[i + j] != num[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                encontrada = true;
                break;
            }
        }

        if (encontrada) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}