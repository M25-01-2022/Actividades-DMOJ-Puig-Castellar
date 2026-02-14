package Operadors;

import java.util.Locale;
import java.util.Scanner;
public class c1l22provamecano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int c = sc.nextInt();
        int e = sc.nextInt();
        int t = sc.nextInt();
        //Precision
        System.out.println((c - e) * 100 / c);
        //Velocidad por palabra
        float v = ((float)c/5)/((float)t /60);
        System.out.print((int) v);
    }
}