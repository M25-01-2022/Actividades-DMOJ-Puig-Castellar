package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class c1l42uncavallco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int xC = sc.nextInt();
        int yC = sc.nextInt();
        int xP1 = sc.nextInt();
        int yP1 = sc.nextInt();
        int xP2 = sc.nextInt();
        int yP2 = sc.nextInt();
        int[][] moves = {
                { 2,  1}, { 2, -1}, {-2,  1}, {-2, -1},
                { 1,  2}, { 1, -2}, {-1,  2}, {-1, -2}
        };
        int amenaza = 0;
        int[][] peones = {{xP1, yP1}, {xP2, yP2}};
        for (int[] peon : peones) {
            for (int[] n : moves) {
                if (xC + n[0] == peon[0] && yC + n[1] == peon[1]) {
                    amenaza++;
                    break;
                }
            }
        }
        System.out.println(amenaza);
    }
}