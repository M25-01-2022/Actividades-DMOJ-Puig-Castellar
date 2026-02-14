package Bucles;

import java.util.Locale;
import java.util.Scanner;

public class sumarparells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] l = new int[n];
        for(int i = 0; i < n; i++){
            l[i] = sc.nextInt();
        }
        int r = 0;
        for(int i = 0; i < n; i++){
            if(l[i] % 2 == 0){
                r += l[i];
            }
        }
        System.out.print(r);
    }
}