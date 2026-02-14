package Operadors;

import java.util.Locale;
import java.util.Scanner;
public class totsdecsenarsocap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();

        int i1 = (int) n1;
        int i2 = (int) n2;
        int i3 = (int) n3;

        boolean p1 = (i1 % 2 != 0);
        boolean p2 = (i2 % 2 != 0);
        boolean p3 = (i3 % 2 != 0);

        boolean tp = p1 && p2 && p3;
        boolean ts = !p1 && !p2 && !p3;
        System.out.println(tp || ts);
    }
}