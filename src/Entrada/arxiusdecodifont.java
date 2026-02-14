package Entrada;

import java.util.*;
public class arxiusdecodifont {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String d1 = sc.next();
        String a1 = sc.nextLine();
        String d2 = sc.next();
        String a2 = sc.nextLine();
        String d3 = sc.next();
        String a3 = sc.nextLine();
        String d4 = sc.next();
        String a4 = sc.nextLine();

        System.out.println(a4 + " " + d4);
        System.out.println(a3 + " " + d3);
        System.out.println(a2 + " " + d2);
        System.out.println(a1 + " " + d1);
    }
}