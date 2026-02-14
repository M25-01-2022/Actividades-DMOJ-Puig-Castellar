package Recursivitat;

import java.util.Locale;
import java.util.Scanner;
public class c7l11sumaelsnp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int res = 0;
        for(int i = 0; i <= n; i++){
            res += i;
        }
        System.out.print(res);
    }
}