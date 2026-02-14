package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class secuenciasrotativas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        int nums = sc.nextInt();
        for (int i = 0; i < nums; i++) {
            System.out.print(num[i % n] + " ");
        }
        System.out.println();
    }
}