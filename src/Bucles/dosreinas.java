package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class dosreinas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int bRow = 0, bCol = 0;
        int nRow = 0, nCol = 0;

        for (int i = 0; i < 8; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < 8; j++) {
                char c = line.charAt(j);
                if (c == 'B') {
                    bRow = i;
                    bCol = j;
                } else if (c == 'N') {
                    nRow = i;
                    nCol = j;
                }
            }
        }
        boolean attack = false;
        if (bRow == nRow) {
            attack = true;
        }
        else if (bCol == nCol) {
            attack = true;
        }
        else if (Math.abs(bRow - nRow) == Math.abs(bCol - nCol)) {
            attack = true;
        }
        if (attack) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}