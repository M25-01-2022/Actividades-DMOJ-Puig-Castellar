package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class escaladecartes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        //Invertir array
        for (int i = 0; i < n - 1; i++) {
            int max = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[max]){
                    max = j;
                }
            }
            if (max != i) {
                int tmp = a[i];
                a[i] = a[max];
                a[max] = tmp;
            }
        }
        //Grande, pequeño y mediano
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
            if (i == (n - 1)){
                System.out.println();
                System.out.println("La carta més gran és: " + a[0]);
                System.out.println("La carta més petita és: " + a[n - 1]);
                System.out.println("La carta del mig és: " + a[n / 2]);
            }
        }
        //Escalera o no
        boolean escala = true;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] - a[i + 1] != 1) {
                escala = false;
                break;
            }
        }
        System.out.println("Es tracta d'una escala: " + (escala ? "SI" : "NO"));
    }
}