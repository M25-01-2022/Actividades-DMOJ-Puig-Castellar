package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class c6a99cromosrepetit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] contador = new int[69];
        for (int i = 0; i < n; i++) {
            int cromo = sc.nextInt();
            contador[cromo]++;
        }
        for (int i = 1; i <= 68; i++) {
            if (contador[i] > 1) {
                System.out.println(i + ": " + contador[i]);
            }
        }
    }
}