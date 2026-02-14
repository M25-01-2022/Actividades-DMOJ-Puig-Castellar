package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class fontanadipuig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int m5 = 0, m10 = 0, m20 = 0, m50 = 0, m100 = 0, m200 = 0;
        int anterior = 0;
        while (true) {
            int actual = sc.nextInt();
            if (actual == 0) break;

            int incremento = actual - anterior;

            switch (incremento) {
                case 5:   m5++; break;
                case 10:  m10++; break;
                case 20:  m20++; break;
                case 50:  m50++; break;
                case 100: m100++; break;
                case 200: m200++; break;
            }

            anterior = actual;
        }
        System.out.println("5) " + m5);
        System.out.println("10) " + m10);
        System.out.println("20) " + m20);
        System.out.println("50) " + m50);
        System.out.println("100) " + m100);
        System.out.println("200) " + m200);
    }
}