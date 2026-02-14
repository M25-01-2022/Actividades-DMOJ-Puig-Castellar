package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class mezcladesecuencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] seq1 = new int[n];
        for (int i = 0; i < n; i++) {
            seq1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] seq2 = new int[m];
        for (int i = 0; i < m; i++) {
            seq2[i] = sc.nextInt();
        }
        int i = 0, j = 0;
        boolean first = true;
        while (i < n && j < m) {
            if (!first) System.out.print(" ");
            System.out.print(seq1[i++]);
            System.out.print(" ");
            System.out.print(seq2[j++]);
            first = false;
        }
        while (i < n) {
            System.out.print(" " + seq1[i++]);
        }
        while (j < m) {
            System.out.print(" " + seq2[j++]);
        }
    }
}