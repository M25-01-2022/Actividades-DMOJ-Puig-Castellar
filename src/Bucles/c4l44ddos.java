package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class c4l44ddos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        double[] times = new double[100000];
        int n = 0;
        while (true) {
            double t = sc.nextDouble();
            if (t == -1) break;
            times[n++] = t;
        }
        for (int i = 0; i + 2 < n; i++) {
            double sum = times[i] + times[i + 1] + times[i + 2];
            if (sum < 1.0) {
                System.out.println("DDoS alert");
            }
        }
    }
}