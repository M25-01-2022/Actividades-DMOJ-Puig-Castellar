package Operadors;

import java.util.Locale;
import java.util.Scanner;

public class bigben {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int h = sc.nextInt();
        int z = sc.nextInt();

        int r = (h + z) % 12;

        System.out.println(r);
    }
}