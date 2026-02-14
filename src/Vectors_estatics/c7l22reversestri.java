package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class c7l22reversestri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String p = sc.nextLine();
        char[] pal = p.toCharArray();
        for (int i = pal.length - 1; i >= 0; i--){
            System.out.print(pal[i]);
        }
    }
}