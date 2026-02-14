package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class c3l41buildawall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int p = sc.nextInt();
        int l = sc.nextInt();
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print("-");
                for (int k = 0; k < w; k++) {
                    System.out.print("-");
                }
            }
            System.out.println("-");
            boolean shift = i % 2 == 1;
            int bricks = shift ? p - 1 : p;
            for (int row = 0; row < h; row++) {
                if (shift) System.out.print("    ");
                for (int j = 0; j < bricks; j++) {
                    System.out.print("|");
                    for (int k = 0; k < w; k++) {
                        System.out.print(" ");
                    }
                }
                System.out.println("|");
            }
        }
        for (int j = 0; j < p; j++) {
            System.out.print("-");
            for (int k = 0; k < w; k++) {
                System.out.print("-");
            }
        }
        System.out.println("-");
    }
}