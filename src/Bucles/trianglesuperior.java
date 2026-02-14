package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class trianglesuperior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int m;
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                m = sc.nextInt();
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}