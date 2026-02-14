package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class c3l27descompressi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        char[] p = sc.nextLine().toCharArray();
        for (int i = 0; i < p.length; i++){
            if (Character.isDigit(p[i])){
                String l = String.valueOf(p[i + 1]);
                int n = Integer.parseInt(String.valueOf(p[i]));
                System.out.print(l.repeat(n));
            }
        }
    }
}