package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class c3l08showlinenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int linea = 1;
        while (true){
            String p = sc.nextLine();
            if(p.equals("END")) break;
            System.out.println(linea + " | " + p);
            linea++;
        }
    }
}