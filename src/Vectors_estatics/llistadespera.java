package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class llistadespera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        String[] centros = new String[n];
        for (int i = 0; i < n; i++) {
            centros[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            int contador = 0;
            for (int j = 0; j < i; j++) {
                if (centros[j].equals(centros[i])) {
                    contador++;
                }
            }
            System.out.print(contador);
            if (i < n - 1) System.out.print(" ");
        }
    }
}