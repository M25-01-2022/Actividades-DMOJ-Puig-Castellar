package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class alturaminima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        float[] num = new float[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextFloat();
        }

        float max = sc.nextFloat();
        for (int i = 0; i < n; i++) {
            if (num[i] >= max) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}