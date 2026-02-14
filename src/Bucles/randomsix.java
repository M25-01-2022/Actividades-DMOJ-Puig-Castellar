package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class randomsix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int base = n;
        for (int i = 0; i < m; i++) {
            int res = (base / 10) + (base % 10) * 6;
            System.out.println(res);
            base = res;
        }
    }
}