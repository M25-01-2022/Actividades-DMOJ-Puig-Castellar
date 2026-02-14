package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class sumaimparells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int base = 0;
        for (int i = 0; i < n; i++) if (i % 2 != 0) base += i;
        if (n < 0) System.out.println("Error: número invàlid");
        else System.out.print("La suma dels números imparells fins a " + n + " és: " + base);
    }
}