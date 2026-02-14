package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class mitjanasuperiornota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] notes = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                notes[i][j] = sc.nextInt();
            }
        }
        float min = sc.nextFloat();
        for (int i = 0; i < n; i++){
            int sum = 0;
            for (int j = 0; j < m; j++){
                sum += notes[i][j];
            }
            float pro = (float) sum / m;
            System.out.println(pro + " " + (pro >= min ? "SI" : "NO"));
        }
    }
}