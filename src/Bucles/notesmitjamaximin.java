package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class notesmitjamaximin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        String[] alum = new String[n];
        float[] nota = new  float[n];
        for (int i = 0; i < n; i++) {
            alum[i] = sc.next();
            nota[i] = sc.nextFloat();
        }

        float max = 0;
        for (int i = 0; i < n; i++) {
            if (max < nota[i]) {
                max = nota[i];
            }
        }

        float min = nota[0];
        for (int i = 0; i < n; i++) {
            if (min > nota[i]) {
                min = nota[i];
            }
        }
        float promig = 0.0f;
        for (int i = 0; i < n; i++) {
            if(nota[i] == max){
                System.out.println("L'alumne amb major nota és el/la " + alum[i] + " amb un " + nota[i]);
            }
            if(nota[i] == min){
                System.out.println("L'alumne amb menor nota és el/la " + alum[i] + " amb un " + nota[i]);
            }
            promig += nota[i];
        }
        float res = promig / nota.length;
        System.out.println("La nota mitjana de la classe és de " + res);
    }
}