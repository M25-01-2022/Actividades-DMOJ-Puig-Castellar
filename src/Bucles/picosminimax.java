package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class picosminimax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int[] peaks = new int[N];
            for (int i = 0; i < N; i++) {
                peaks[i] = sc.nextInt();
            }
            System.out.print(peaks[0]);

            for (int i = 1; i < N; i++) {
                int prev = peaks[i - 1];
                int curr = peaks[i];
                if (curr > prev) {
                    for (int x = prev + 1; x <= curr; x++) {
                        System.out.print(" " + x);
                    }
                } else {
                    for (int x = prev - 1; x >= curr; x--) {
                        System.out.print(" " + x);
                    }
                }
            }
            if (t < T - 1) {
                System.out.println();
            }
        }
    }
}