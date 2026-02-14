package Sortida;

import java.util.*;
public class unicodepoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int p3 = sc.nextInt();
        int p4 = sc.nextInt();
        int p5 = sc.nextInt();
        int p6 = sc.nextInt();

        char t1 = (char) p1;
        char t2 = (char) p2;
        char t3 = (char) p3;
        char t4 = (char) p4;
        char t5 = (char) p5;
        char t6 = (char) p6;

        System.out.print(t1);
        System.out.print(t2);
        System.out.print(t3);
        System.out.print(t4);
        System.out.print(t5);
        System.out.print(t6);
    }
}