package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class quantitatdivisibles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int contador = 0;
        for (int i = 0; i < n; i++){
            if (num[i] % d == 0) contador++;
        }
        System.out.print(contador);
    }
}