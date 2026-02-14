package Operadors;

import java.util.Locale;
import java.util.Scanner;
public class stigidsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int m= 0;

        while (n !=0){
            m=m*10+n%10;
            n/=10;
        }
        System.out.println(m);
    }
}