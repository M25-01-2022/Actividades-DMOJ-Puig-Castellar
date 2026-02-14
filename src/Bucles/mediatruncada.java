package Bucles;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class mediatruncada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        float[] scores = new float[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextFloat();
        }
        Arrays.sort(scores);
        float sum = 0;
        for (int i = 1; i < n - 1; i++) {
            sum += scores[i];
        }
        float average = sum / (n - 2);
        System.out.println(average);
    }
}