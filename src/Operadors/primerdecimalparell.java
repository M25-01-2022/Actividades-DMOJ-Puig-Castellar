package Operadors;

import java.util.Locale;
import java.util.Scanner;
public class primerdecimalparell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        float n = sc.nextFloat();
        String p = Float.toString(n);
        char r = p.charAt(2);
        System.out.println(r % 2 == 0);
    }
}