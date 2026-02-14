package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class c4l24balanceigde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] discos = new int[n];
        for (int i = 0; i < n; i++) {
            discos[i] = sc.nextInt();
        }
        while (true) {
            int bloque = sc.nextInt();
            if (bloque == 0) break;
            int idx = 0;
            int minOcup = discos[0];
            for (int i = 1; i < n; i++) {
                if (discos[i] < minOcup) {
                    minOcup = discos[i];
                    idx = i;
                }
            }
            discos[idx] += bloque;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(discos[i]);
            if (i != n - 1) System.out.print(" ");
        }
        System.out.println();
    }
}