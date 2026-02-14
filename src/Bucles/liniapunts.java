package Bucles;

import java.util.*;
public class liniapunts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        String punto = ".";
        System.out.print(punto.repeat(n));
    }
}
