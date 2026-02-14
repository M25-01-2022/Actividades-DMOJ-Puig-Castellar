package Operadors;

import java.util.*;
public class cargol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int dies = 0;
        int num = 0;
        while (true) {
            dies++;
            num += a;
            if (num >= h) {
                break;
            }
            num -= b;
        }
        System.out.println(dies);
    }
}