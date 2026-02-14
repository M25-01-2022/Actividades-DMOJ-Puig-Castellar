package Operadors;

import java.util.Locale;
import java.util.Scanner;

public class c1l38cubderubik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        long t = sc.nextLong();

        long Tcubs = (t * t * t);
        long centre = (t - 2) * (t - 2) * (t - 2);

        System.out.println(Tcubs - centre);
    }
}
