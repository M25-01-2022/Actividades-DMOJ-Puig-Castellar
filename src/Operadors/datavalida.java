package Operadors;

import java.util.Locale;
import java.util.Scanner;
public class datavalida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        int diesMes;
        boolean aB = (y % 4 == 0) && (y % 100 != 0 || y % 400 == 0);
        switch (m) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diesMes = 31; break;
            case 4: case 6: case 9: case 11:
                diesMes = 30; break;
            case 2:
                diesMes = aB ? 29 : 28; break;
            default:
                System.out.println("false");
                return;
        }

        if (d >= 1 && d <= diesMes) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}