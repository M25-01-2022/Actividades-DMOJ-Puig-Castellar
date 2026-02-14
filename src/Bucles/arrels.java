package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class arrels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int z = sc.nextInt();

        if (n == 1) {
            System.out.println("TRUE");
            return;
        }
        int temp = n;
        boolean esEntero = true;

        for (int i = 2; i * i <= temp; i++) {
            int contador = 0;
            while (temp % i == 0) {
                contador++;
                temp /= i;
            }
            if (contador > 0) {
                if ((contador * e) % z != 0) {
                    esEntero = false;
                    break;
                }
            }
        }

        if (temp > 1) {
            if (e % z != 0) {
                esEntero = false;
            }
        }

        System.out.println(esEntero ? "TRUE" : "FALSE");
    }
}