package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class aturaeltren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String s = sc.next();
        int p = sc.nextInt();
        boolean o = sc.nextBoolean();

        boolean t1 = s.equals("verd") && p >= 0 && !o;
        boolean t2 = s.equals("verd") && p == 0 && o;
        boolean t3 = s.equals("verd") && p == 0 && !o;
        boolean t4 = s.equals("groc") && p >= 0 && !o;
        boolean t5 = s.equals("groc") && p == 0 && o;
        boolean t6 = s.equals("groc") && p == 0 && !o;
        boolean res = t1 || t2 || t3 || t4 || t5 || t6;

        if(res)System.out.println("CONTINUAR");
        else System.out.println("ATURAR");

    }
}