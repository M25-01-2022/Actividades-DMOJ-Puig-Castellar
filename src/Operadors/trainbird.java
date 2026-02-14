package Operadors;

import java.util.Locale;
import java.util.Scanner;
public class trainbird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float dv = sc.nextFloat();
        float vt = sc.nextFloat();
        float vo = sc.nextFloat();

        float km = (dv * vo) / vt;
        System.out.println(km);
    }
}
