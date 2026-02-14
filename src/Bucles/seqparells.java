package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class seqparells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = n; i <= m; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}