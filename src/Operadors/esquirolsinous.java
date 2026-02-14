package Operadors;

import java.util.Locale;
import java.util.Scanner;

public class esquirolsinous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int E = sc.nextInt();
        int N = sc.nextInt();

        System.out.println(N % E);
    }
}
