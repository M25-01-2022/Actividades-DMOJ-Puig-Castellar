package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class clauacces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] pin = new int[n];
        for (int i = 0; i < n; i++) pin[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[m];
        for (int i = 0; i < m; i++) num[i] = sc.nextInt();
        int contador = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (pin[i] == num[j]){
                    contador++;
                    break;
                }
            }
        }
        if (contador == n) System.out.println("OK");
        else System.out.println("ERROR");
    }
}