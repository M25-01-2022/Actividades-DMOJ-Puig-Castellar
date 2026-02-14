package Operadors;

import java.util.Locale;
import java.util.Scanner;
public class nomesundecimalparell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        float q = sc.nextFloat();
        float w = sc.nextFloat();
        float e = sc.nextFloat();
        int r = (int)q;
        int t = (int)w;
        int y = (int)e;
        int res = (r % 2 == 0 ? 1 : 0) + (t % 2 == 0 ? 1 : 0) + (y % 2 == 0 ? 1 : 0);
        System.out.println(res == 1);
    }
}