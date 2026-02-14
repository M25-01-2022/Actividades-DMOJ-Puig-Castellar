package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class posiciovalormesgran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] num =  new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int base = num[0];
        int posicio = 0;
        for (int i = 0; i < n; i++) {
            if (num[i] > base) {
                base = num[i];
                posicio = i;
            }
        }
        System.out.println("El nombre més gran és el " + base + " i es troba a la posició " + (posicio+1));
    }
}