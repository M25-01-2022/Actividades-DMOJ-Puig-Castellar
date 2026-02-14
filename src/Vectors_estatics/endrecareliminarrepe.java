package Vectors_estatics;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class endrecareliminarrepe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.print(a[0] + " ");
        for(int i = 1; i < n; i++){
            if(a[i] != a[i - 1]){
                System.out.print(a[i] + " ");
            }
        }
    }
}