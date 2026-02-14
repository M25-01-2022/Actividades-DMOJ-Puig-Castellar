package Operadors;

import java.util.Locale;
import java.util.Scanner;
public class contractarunprogra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        boolean j = sc.nextBoolean();
        int aj = sc.nextInt();
        boolean p = sc.nextBoolean();
        int ap = sc.nextInt();
        System.out.println((j && aj >= 1) || (p && ap >= 3));
    }
}