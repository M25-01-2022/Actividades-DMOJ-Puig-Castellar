package Bucles;

import java.util.*;
public class calcularfibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
            System.out.print(a + " ");
        }
    }
}