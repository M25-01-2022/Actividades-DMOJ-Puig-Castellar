package Operadors;

import java.util.Locale;
import java.util.Scanner;

public class tempsdedes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int kb = sc.nextInt();
        int mb = sc.nextInt();

        int Mb = mb * 1024;

        System.out.println(Mb / kb);
    }
}