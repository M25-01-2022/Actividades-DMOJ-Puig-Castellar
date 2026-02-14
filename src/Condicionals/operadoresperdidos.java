package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class operadoresperdidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int o = sc.nextInt();
        String res;
        try{
            if (n + m == o) res = "+";
            else if (n - m == o) res = "-";
            else if (n * m == o) res = "*";
            else if (n / m == o) res = "/";
            else if (n % m == o) res = "%";
            else {
                System.out.println("IMPOSSIBLE");
                return;
            }
            System.out.print(res);
        } catch (ArithmeticException e){
            System.out.println("IMPOSSIBLE");
        }
    }
}