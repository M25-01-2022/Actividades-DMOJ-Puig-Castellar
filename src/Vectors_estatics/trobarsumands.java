package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class trobarsumands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int res = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean sum = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] + a[j] == res) {
                    System.out.println(a[i] + " " + a[j]);
                    return;
                }
            }
        }
        if (!sum) {
            System.out.println(-1 + " " + -1);
        }
    }
}