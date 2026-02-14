package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class salari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        double[] hores = new double[n];
        for (int i = 0; i < n; i++){
            hores[i] = sc.nextDouble();
        }
        double preuHora = sc.nextDouble();
        double preuExtra = sc.nextDouble();
        double salari = 0.0;
        for (int i = 0; i < n; i++) {
            int diaSetmana = i % 7;
            if (diaSetmana == 0 || diaSetmana == 6) {
                salari += hores[i] * preuExtra;
            } else {
                salari += hores[i] * preuHora;
            }
        }
        System.out.println((int)salari);
    }
}