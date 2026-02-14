package Cadenes_de_text;

import java.util.Locale;
import java.util.Scanner;
public class extractnumslongvar {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String p = sc.next();
        char[] si = p.toCharArray();
        int res = 0;
        for (char c : si){
            if (Character.isDigit(c)) res += Integer.parseInt(String.valueOf(c));
        }
        System.out.print(res);
    }
}