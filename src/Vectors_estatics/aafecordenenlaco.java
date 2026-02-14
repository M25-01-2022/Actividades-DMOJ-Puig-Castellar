package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class aafecordenenlaco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        boolean colada = false;
        for (int i = 0; i < n; i++){
            int contador = 0;
            for (int j = i + 1; j < n; j++) {
                if (num[j] < num[i]) {
                    contador++;
                }
            }
            if (contador > 0) {
                System.out.println("La persona con el ticket " + num[i] + " se ha colado por delante de " + contador + " personas.");
                colada = true;
            }
        }

        if (!colada) {
            System.out.println("COLA EN ORDEN");
        }
    }
}