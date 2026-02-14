package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class minimax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) num[i] = sc.nextInt();
        int min = num[0];
        int posimin = 0;
        int max = num[0];
        int posimax = 0;
        for (int i = 0; i < n; i++) {
            if (min > num[i]) {
                min = num[i];
                posimin = i;
            } else if (max < num[i]) {
                max = num[i];
                posimax = i;
            }
        }
        System.out.println("El número mínim és " + min + " i es troba a la posició " + posimin + ".");
        System.out.println("El número màxim és " + max + " i es troba a la posició " + posimax + ".");
    }
}