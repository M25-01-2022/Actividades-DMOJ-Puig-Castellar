package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class graficosdecalifica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        List<Integer> num = new ArrayList<>();
        while (true){
            int n = sc.nextInt();
            if (n == -1) break;
            num.add(n);
        }
        int E = 0, N = 0, B = 0, S = 0, I = 0;
        for (int nota : num) {
            if (nota >= 9 && nota <= 10) {
                E++;
            } else if (nota >= 7) {
                N++;
            } else if (nota >= 6) {
                B++;
            } else if (nota >= 5) {
                S++;
            } else if (nota >= 0) {
                I++;
            }
        }
        String hashtag = "#";
        System.out.println("E:" + hashtag.repeat(E));
        System.out.println("N:" + hashtag.repeat(N));
        System.out.println("B:" + hashtag.repeat(B));
        System.out.println("S:" + hashtag.repeat(S));
        System.out.println("I:" + hashtag.repeat(I));
    }
}