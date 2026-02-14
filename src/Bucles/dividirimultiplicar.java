package Bucles;

import java.util.*;
public class dividirimultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int m = sc.nextInt();
        float res = n;
        System.out.print(res + " ");
        for (int i = n + 1; i <= m; i++) {
            if (i != 0) {
                if (i % 2 == 0) {
                    res = res / i;
                    System.out.print(res + " ");
                } else {
                    res = res * i;
                    System.out.print(res + " ");
                }
            } else {
                System.out.print(res + " ");
            }
        }
    }
}
