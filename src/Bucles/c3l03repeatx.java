package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class c3l03repeatx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print(n);
        }
    }
}