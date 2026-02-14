package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class superbowling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        long n = sc.nextLong();
        long x = 1 + 8 * n;
        long r = (long) Math.sqrt(x);

        if (r * r == x && (r - 1) % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}