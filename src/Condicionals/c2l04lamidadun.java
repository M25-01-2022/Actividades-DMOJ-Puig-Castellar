package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class c2l04lamidadun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        String res;
        if (n >= 1 && n < 3)res = "petit";
        else if (n >= 3 && n < 5) res = "mitja";
        else if (n >= 5 && n < 8) res = "gran";
        else if (n >= 8 && n <= 10) res = "molt gran";
        else res = "mida incorrecta";
        System.out.print(res);
    }
}