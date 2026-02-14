package Operadors;

import java.util.Locale;
import java.util.Scanner;
public class c1l26ticketdapar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        float tarifa = sc.nextFloat();
        float diners = sc.nextFloat();

        float min = tarifa * diners;
        int seg = Math.round(min * 60);

        int totalSegI = h * 3600 + m * 60 + s;
        int totalSegF = totalSegI + seg;

        int hFinal = totalSegF / 3600;
        int mFinal = (totalSegF % 3600) / 60;
        int sFinal = totalSegF % 60;

        System.out.println(hFinal + ":" + mFinal + ":" + sFinal);
    }
}