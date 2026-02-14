package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class cb550barrelcannon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        int posicio = sc.nextInt();
        boolean[] visitado = new boolean[n];
        String acaba = "";

        while (true) {
            if (visitado[posicio]) {
                acaba = "BUCLE";
                break;
            }
            visitado[posicio] = true;
            int salto = num[posicio];
            int nuevaPosicio = posicio + salto;

            if (nuevaPosicio < 0) {
                acaba = "IZQUIERDA";
                break;
            }
            if (nuevaPosicio >= n) {
                acaba = "DERECHA";
                break;
            }
            posicio = nuevaPosicio;
        }

        System.out.println(acaba);
    }
}