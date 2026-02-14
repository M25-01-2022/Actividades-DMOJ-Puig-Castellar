package Excepcions;

import java.util.Locale;
import java.util.Scanner;
public class arithmeticexception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        try {
            int n = sc.nextInt();
            System.out.println(10/n);
        } catch (Exception e){
            System.out.println("No es pot dividir entre zero!");
        }
    }
}