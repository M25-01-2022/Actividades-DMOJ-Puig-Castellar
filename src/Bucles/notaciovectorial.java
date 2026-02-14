package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class notaciovectorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        System.out.print("int[] myArray = { ");
        for (int i = 0; i < n; i++){
            if (i == n - 1) System.out.print(num[i]);
            else System.out.print(num[i] + ", ");
        }
        System.out.print(" };");
    }
}