package Operadors;

import java.util.Locale;
import java.util.Scanner;

public class totsparellsocap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        boolean tS = (n1 % 2 != 0) && (n2 % 2 != 0) && (n3 % 2 != 0);
        boolean cS = (n1 % 2 == 0) && (n2 % 2 == 0) && (n3 % 2 == 0);
        System.out.println(tS || cS);
    }
}
