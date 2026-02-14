package Operadors;

import java.util.Locale;
import java.util.Scanner;
public class c1l16llumsapagad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        boolean n1 = sc.nextBoolean();
        boolean n2 = sc.nextBoolean();
        boolean n3 = sc.nextBoolean();
        boolean n4 = sc.nextBoolean();

        System.out.println(!(n1 || n2 || n3 || n4));
    }
}
