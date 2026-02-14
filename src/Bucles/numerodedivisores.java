package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class numerodedivisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int divisores = 0;
        for (int i = 1; i <=n; i++){
            if (n % i == 0){
                divisores++;
            }
        }
        System.out.println(divisores);
    }
}