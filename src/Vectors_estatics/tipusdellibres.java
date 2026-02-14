package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class tipusdellibres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int min = b[0];
        for (int i = 1; i < n; i++) {
            if (b[i] < min) {
                min = b[i];
            }
        }
        System.out.println("el llistat de llibres que menys tenim són:");
        for (int i = 0; i < n; i++) {
            if (b[i] == min) {
                System.out.println(a[i] + " " + b[i]);
            }
        }
    }
}