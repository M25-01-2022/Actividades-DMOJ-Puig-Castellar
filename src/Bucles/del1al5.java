package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class del1al5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            boolean[] numvisto = new boolean[6];
            while (true) {
                int m = sc.nextInt();
                if (m == 0) break;
                if (m >= 1 && m <= 5) {
                    numvisto[m] = true;
                }
            }
            boolean todos = true;
            for (int j = 1; j <= 5; j++) {
                if (!numvisto[j]) {
                    todos = false;
                    break;
                }
            }
            if (todos) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}