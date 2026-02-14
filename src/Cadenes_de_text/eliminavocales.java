package Cadenes_de_text;

import java.util.Locale;
import java.util.Scanner;
public class eliminavocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String n = sc.nextLine();
        char[] chars = n.toCharArray();
        char[] vocals = {'a','e','i','o','u','A','E','I','O','U'};
        for (char c : chars){
            boolean novocal = true;
            for (char v : vocals){
                if (c == v){
                    novocal = false;
                    break;
                }
            }
            if (novocal){
                System.out.print(c);
            }
        }
    }
}