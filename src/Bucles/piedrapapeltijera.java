package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class piedrapapeltijera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int punts1 = 0;
        int punts2 = 0;

        while (true) {
            String linia = sc.next();
            if (linia.equals("END")) break;

            char j1 = linia.charAt(0);
            char j2 = linia.charAt(1);

            if (j1 == j2) continue;

            if ((j1 == '@' && j2 == '%') ||
                    (j1 == '#' && j2 == '@') ||
                    (j1 == '%' && j2 == '#'))
            {
                punts1++;
            } else {
                punts2++;
            }
        }

        if (punts1 > punts2) System.out.println(1);
        else if (punts2 > punts1) System.out.println(2);
        else System.out.println("-");
    }
}