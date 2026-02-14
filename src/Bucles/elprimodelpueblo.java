package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class elprimodelpueblo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        boolean esPrimo = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                esPrimo = false;
                break;
            }
        }
        if (esPrimo) {
            System.out.println(esPrimo);
        } else {
            System.out.println(esPrimo);
        }
    }
}