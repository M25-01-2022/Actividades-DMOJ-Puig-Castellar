package Operadors;

import java.util.Locale;
import java.util.Scanner;
public class majordedat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();

        System.out.println(n >= 18);
    }
}
