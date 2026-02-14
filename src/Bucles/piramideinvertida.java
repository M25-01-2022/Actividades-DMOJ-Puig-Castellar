package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class piramideinvertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int m = n;
        for (int i = 0; i < n; i++){
            for (int j = m - 1 ; j >= 0; j--){
                System.out.print("*");
            }
            System.out.println();
            m--;
        }
    }
}