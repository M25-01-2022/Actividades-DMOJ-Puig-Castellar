package Bucles;

import java.util.*;
public class xirtam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print((anInt == 0 ? 1 : 0) + " ");
            }
            System.out.println();
        }
    }
}