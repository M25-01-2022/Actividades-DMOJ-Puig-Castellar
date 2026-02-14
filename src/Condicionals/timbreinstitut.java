package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class timbreinstitut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int h = sc.nextInt();
        int m = sc.nextInt();
        String a = sc.next();
        if(m == 00 && a.equals("automatic")){
            System.out.println("RING");
        } else if (a.equals("manual")) {
            System.out.println("RING");
        } else if (a.equals("alarma")) {
            System.out.println("RING RING RING");
        } else {
            System.out.println("---");
        }
    }
}