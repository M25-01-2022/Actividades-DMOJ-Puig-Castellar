package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class reaccioencadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] bombes = new int[n];
        for (int i = 0; i < n; i++){
            bombes[i] = sc.nextInt();
        }
        int contador = 1;
        int i = 0;
        int max = 0;

        while (i <= max && i < n) {
            max = Math.max(max, i + bombes[i]);
            contador = max + 1;
            i++;
        }
        if (contador > n) {
            contador = n;
        }
        System.out.print(contador);
    }
}