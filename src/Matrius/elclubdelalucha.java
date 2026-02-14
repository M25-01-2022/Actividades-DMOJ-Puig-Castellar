package Matrius;

import java.util.Locale;
import java.util.Scanner;
public class elclubdelalucha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        String[] nombres = new String[n];
        for (int i = 0; i < n; i++) {
            nombres[i] = sc.next();
        }
        int[] fuerzas = new int[n];
        for (int i = 0; i < n; i++) {
            fuerzas[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String l1 = sc.next();
            String l2 = sc.next();

            int idx1 = -1, idx2 = -1;
            for (int j = 0; j < n; j++) {
                if (nombres[j].equals(l1)) idx1 = j;
                if (nombres[j].equals(l2)) idx2 = j;
            }
            int min = Math.min(fuerzas[idx1], fuerzas[idx2]);

            fuerzas[idx1] -= min;
            fuerzas[idx2] -= min;
        }
        for (int i = 0; i < n; i++) {
            if (fuerzas[i] > 0) {
                System.out.println(nombres[i] + ": " + fuerzas[i]);
            }
        }
    }
}