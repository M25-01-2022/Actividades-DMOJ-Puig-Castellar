package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class classificartrianglec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int o = sc.nextInt();
        if (n == m && m == o) System.out.println("Equilàter");
        else if (n == m || n == o || m == o) System.out.println("Isòsceles");
        else System.out.println("Escalè");
    }
}