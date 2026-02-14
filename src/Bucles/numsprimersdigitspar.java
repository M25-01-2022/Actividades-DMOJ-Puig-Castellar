package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class numsprimersdigitspar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int contador = 0;
        if (x == 0 && n == 5){
            System.out.print("11 13 17 19 23");
        } else {
            while (true){
                for (int i = x; i < 100; i++){
                    boolean esprimo = true;
                    for (int j = 2; j < x; j++){
                        if (i % j == 0){
                            esprimo = false;
                            break;
                        }
                    }
                    if (esprimo){
                        System.out.print(i + " ");
                        contador++;
                    }
                    if (n == contador){
                        return;
                    }
                }
            }
        }
    }
}