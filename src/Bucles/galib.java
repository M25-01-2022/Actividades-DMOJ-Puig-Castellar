package Bucles;

import java.util.*;
public class galib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        float h = sc.nextFloat();
        int n = sc.nextInt();
        float[] coche = new float[n];
        for(int i = 0; i < n; i++){
            coche[i] = sc.nextFloat();
            if (coche[i] <= h){
                System.out.println("xoca amb el pont " + (i + 1));
                return;
            }
        }
    }
}