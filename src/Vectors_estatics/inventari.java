package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class inventari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int max = sc.nextInt();
        int n = sc.nextInt();
        String[] cosas = new String[n];
        int[] vida = new int[n];
        for (int i = 0; i < n; i++){
            cosas[i] = sc.next();
        }
        for (int i = 0; i < n; i++){
            vida[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String producto = sc.next();
            int cantidad = sc.nextInt();
            for (int j = 0; j < n; j++) {
                if (cosas[j].equals(producto)) {
                    if (cantidad > 0) {
                        int total = 0;
                        for (int k = 0; k < n; k++) total += vida[k];
                        int espacio = max - total;
                        vida[j] += Math.min(cantidad, espacio);

                    } else {
                        vida[j] += cantidad;
                        if (vida[j] < 0) vida[j] = 0;
                    }
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(vida[i]);
            if (i != n - 1) System.out.print(" ");
        }
    }
}