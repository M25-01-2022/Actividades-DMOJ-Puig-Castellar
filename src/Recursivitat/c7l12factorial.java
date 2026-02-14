package Recursivitat;

import java.util.Locale;
import java.util.Scanner;
public class c7l12factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int f = 1;
        int n= sc.nextInt();

        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        System.out.println(f);
    }
}