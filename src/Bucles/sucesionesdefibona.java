package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class sucesionesdefibona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        
        int n = sc.nextInt();
        for (int seqNum = 0; seqNum < n; seqNum++) {
            int[] seq = new int[1000];
            int m = 0;
            while (true) {
                int x = sc.nextInt();
                if (x == -1) break;
                seq[m++] = x;
            }
            boolean esFibonacci = true;
            if (m < 2 || seq[0] != 0 || seq[1] != 1) {
                esFibonacci = false;
            }
            for (int i = 2; i < m && esFibonacci; i++) {
                if (seq[i] != seq[i - 1] + seq[i - 2]) {
                    esFibonacci = false;
                }
            }
            System.out.println(esFibonacci ? "SI" : "NO");
        }
    }
}