package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class c2l12lletresscra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String c = sc.next();
        switch (c){
            case "A", "E", "I" , "O", "U", "L", "N", "R", "S", "T" -> System.out.println(1);
            case "D", "G" -> System.out.println(2);
            case "B", "C", "M", "P" -> System.out.println(3);
            case "F" , "H", "V", "W", "Y" -> System.out.println(4);
            case "K" -> System.out.println(5);
            case "J" , "X" -> System.out.println(8);
            case "Q", "Z" -> System.out.println(10);
        }
    }
}