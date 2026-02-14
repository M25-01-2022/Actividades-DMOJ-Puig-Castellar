package Operadors;

import java.util.Locale;
import java.util.Scanner;

public class c1l33piramidesde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();

        int llumins = 0;
        for (int i = 1; i <= n; i++) {
            llumins = llumins + i * 3;
        }

        System.out.println(llumins);
    }
}
