package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class taulesdemultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = n; i <= m; i++){
            int contadorK = 0;
            System.out.println("Taula del " + i);
            for (int j = i; j <= m; j++){
                for (int k = 1; k <= 10; k++){
                    System.out.println(j + " x " + k + " = " + (j * k));
                    contadorK++;
                }
                if (contadorK == 10) {
                    break;
                }
            }
        }
    }
}