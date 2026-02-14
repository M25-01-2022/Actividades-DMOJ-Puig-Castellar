package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class c1l27tirambarc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float dist = (float) Math.sqrt(x * x + y * y);
        int score;
        if (dist < 5) {
            score = 5;
        } else if (dist < 10) {
            score = 4;
        } else if (dist < 15) {
            score = 3;
        } else if (dist < 20) {
            score = 2;
        } else {
            score = 1;
        }
        System.out.println(score);
    }
}