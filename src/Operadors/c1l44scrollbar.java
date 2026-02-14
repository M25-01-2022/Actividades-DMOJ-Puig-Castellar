package Operadors;

import java.util.Locale;
import java.util.Scanner;
public class c1l44scrollbar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int vh = sc.nextInt();
        int ch = sc.nextInt();
        int ah = sc.nextInt();

        int track = vh - 2 * ah;

        int thumbH = (track * vh) / ch;
        int scrollJump = (ch - vh) / (track - thumbH);

        System.out.println(thumbH);
        System.out.println(scrollJump);
    }
}