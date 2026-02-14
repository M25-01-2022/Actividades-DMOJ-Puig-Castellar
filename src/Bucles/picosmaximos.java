package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class picosmaximos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int casos = sc.nextInt();
        for (int c = 0; c < casos; c++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            boolean creciente = true;
            for (int i = 1; i < n; i++) {
                if (a[i] <= a[i - 1]) {
                    creciente = false;
                    break;
                }
            }
            boolean first = true;
            if (!creciente) {
                for (int i = 0; i < n; i++) {
                    boolean pico = true;

                    if (i > 0 && a[i] < a[i - 1]) pico = false;
                    if (i < n - 1 && a[i] < a[i + 1]) pico = false;

                    if (pico) {
                        if (!first) System.out.print(" ");
                        System.out.print(a[i]);
                        first = false;
                    }
                }
            }
            if (c < casos - 1) {
                System.out.println();
            }
        }
    }
}