package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class estantodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        boolean[] vistos = new boolean[n + 1];
        boolean tots = true;
        for (int i = 0; i < n; i++) {
            if (num[i] < 1 || num[i] > n || vistos[num[i]]) {
                tots = false;
                break;
            }
            vistos[num[i]] = true;
        }

        System.out.print(tots ? "SI" : "NO");
    }
}