package Operadors;

import java.util.*;
public class c1l24aprovarelm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int Pt1 = sc.nextInt();
        int Pl1 = sc.nextInt();
        int Ne1 = sc.nextInt();
        int Pt2 = sc.nextInt();
        int Pl2 = sc.nextInt();
        int Ne2 = sc.nextInt();
        int Pt3 = sc.nextInt();
        int Pl3 = sc.nextInt();
        int Ne3 = sc.nextInt();
        boolean UF1 = (Pl1 >= Pt1 * 0.75 && Ne1 >= 4) || (Pl1 >= Pt1 * 0.5 && Ne1 >= 5) || Ne1 > 7;
        boolean UF2 = (Pl2 >= Pt2 * 0.75 && Ne2 >= 4) || Pl2 == Pt2 || (Pl2 >= Pt2 * 0.5 && Ne2 >= 5);
        boolean UF3 = Pl3 == Pt3 && Ne3 >= 5;
        System.out.println(UF1 && UF2 && UF3);
    }
}
