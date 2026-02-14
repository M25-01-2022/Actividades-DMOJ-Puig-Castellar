package Operadors;

import java.util.Locale;
import java.util.Scanner;

public class arecompte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        System.out.println((a+b)*n);
    }
}
