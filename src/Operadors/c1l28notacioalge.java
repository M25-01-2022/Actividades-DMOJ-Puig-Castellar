package Operadors;

import java.util.Locale;
import java.util.Scanner;
public class c1l28notacioalge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int c = sc.nextInt();
        int f = sc.nextInt();

        //el carácter "a" en ASCII es 97
        System.out.print((char)('a' + c - 1) + ""+ f);
    }
}