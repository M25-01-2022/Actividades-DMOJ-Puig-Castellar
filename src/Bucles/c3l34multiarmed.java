package Bucles;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class c3l34multiarmed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        float[] clicks = new float[n];
        float[] shown = new float[n];
        Arrays.fill(clicks, 1.0f);
        Arrays.fill(shown, 1.0f);
        int actions = sc.nextInt();
        for (int i = 0; i < actions; i++) {
            boolean result = sc.nextBoolean();
            int bestIndex = 0;
            float bestRate = clicks[0] / shown[0];
            for (int j = 1; j < n; j++) {
                float rate = clicks[j] / shown[j];
                if (rate > bestRate) {
                    bestRate = rate;
                    bestIndex = j;
                }
            }
            shown[bestIndex] += 1.0f;
            if (result) {
                clicks[bestIndex] += 1.0f;
            }
        }
        float[] percentages = new float[n];
        for (int i = 0; i < n; i++) {
            percentages[i] = (clicks[i] / shown[i]) * 100.0f;
        }
        System.out.println(Arrays.toString(percentages));
    }
}