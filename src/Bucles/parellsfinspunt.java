package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class parellsfinspunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        if (n > 100){
            System.out.print("Nombre massa gran");
        } else {
            System.out.println("Nombres parells fins a " + n + ":");
            for (int i = 0; i <= n; i++){
                if (i % 2 == 0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}