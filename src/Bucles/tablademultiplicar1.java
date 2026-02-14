package Bucles;

import java.util.*;
public class tablademultiplicar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = n; i <= m; i++){
            for(int j = 0; j <= 10; j++){
                int r = i * j;
                System.out.println(i + " x " + j + " = " + r);
            }
        }
    }
}
