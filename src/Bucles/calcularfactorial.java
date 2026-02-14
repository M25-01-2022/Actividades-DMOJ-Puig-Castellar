package Bucles;

import java.util.*;
public class calcularfactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int factorial = 1;
        if (n == 0){
            System.out.print(factorial);
        } else {
            for (int i = 1; i <= n; i++){
                factorial *= i;
            }
            System.out.print(factorial);
        }
    }
}
