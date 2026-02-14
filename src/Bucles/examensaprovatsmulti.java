package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class examensaprovatsmulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        float[][] notas = new float[n][3];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 3; j++){
                notas[i][j] = sc.nextFloat();
            }
        }
        for (int i = 0; i < n; i++){
            int conAprov = 0;
            for (int j = 0; j < 3; j++){
                if (notas[i][j] >= 5.0f){
                    conAprov++;
                }
            }
            if (conAprov == 1) {
                System.out.println("S'ha aprovat un examen.");
            } else if (conAprov == 2){
                System.out.println("S'han aprovat dos exàmens.");
            } else if (conAprov == 3) {
                System.out.println("S'han aprovat tots els exàmens.");
            } else {
                System.out.println("No s'ha aprovat cap examen.");
            }
        }
    }
}