package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class sumadedossecuenci {
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
        for (int i = 0; i < m; i++) {
            System.out.print(num[i] + num2[i] + " ");
        }
    }
}