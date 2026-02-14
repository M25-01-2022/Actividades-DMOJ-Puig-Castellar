package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class igualesalultimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n ;i++){
            num[i] = sc.nextInt();
        }
        int ultimo = num[n - 1];
        int iguals = 0;
        for(int i = 0; i <n - 1; i++) {
            if (num[i] == ultimo) {
                iguals++;
            }
        }
        System.out.println(iguals);
    }
}