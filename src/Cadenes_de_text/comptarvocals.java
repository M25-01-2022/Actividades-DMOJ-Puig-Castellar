package Cadenes_de_text;

import java.util.Locale;
import java.util.Scanner;
public class comptarvocals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String n = sc.nextLine().toLowerCase();
        char[] chars = n.toCharArray();
        int vocals = 0;
        for (char c : chars) {
            if (c == 'a') vocals++;
            else if (c == 'e') vocals++;
            else if (c == 'i') vocals++;
            else if (c == 'o') vocals++;
            else if (c == 'u') vocals++;
        }
        System.out.print(vocals);
    }
}