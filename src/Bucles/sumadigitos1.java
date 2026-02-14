package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class sumadigitos1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        char[] num = String.valueOf(n).toCharArray();
        int base = 0;
        for (int i = 0; i < num.length; i++){
            base += Integer.parseInt(String.valueOf(num[i]));
        }
        System.out.println(base);
    }
}