package Excepcions;

import java.util.Locale;
import java.util.Scanner;
public class arrayindexoutof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        try {
            System.out.println(num[m]);
        } catch (Exception e){
            System.out.println("Aquesta posició no existeix dins l'array.");
        }
    }
}