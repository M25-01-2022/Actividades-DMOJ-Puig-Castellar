package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class tableroajedrez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int ancho = 8 * n;

        System.out.print("|");
        for (int i = 0; i < ancho; i++) {
            System.out.print("-");
        }
        System.out.println("|");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("|");
                for (int k = 0; k < 8; k++) {
                    char c = ((i + k) % 2 == 0) ? ' ' : '#';
                    for (int l = 0; l < n; l++) {
                        System.out.print(c);
                    }
                }
                System.out.println("|");
            }
        }
        System.out.print("|");
        for (int i = 0; i < ancho; i++) {
            System.out.print("-");
        }
        System.out.println("|");
    }
}