package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class dossecuenciasigual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] eros = new int[m];
        for(int i = 0; i < m; i++){
            eros[i] = sc.nextInt();
        }
        int contador = 1;
        if (n == m){
            for(int i = 0; i < n; i++){
                if (num[i] != eros[i]){
                    System.out.println(false);
                    return;
                } else if (contador == n){
                    System.out.println(true);
                }
                contador++;
            }
        } else {
            System.out.println(false);
        }
    }
}