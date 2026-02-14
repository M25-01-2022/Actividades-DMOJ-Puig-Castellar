package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class aprovaono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        sc.nextLine();
        String[] nom = new String[n];
        String[] cognom = new String[n];
        float[] nota = new float[n];
        for (int i = 0; i < n; i++){
            nom[i] = sc.next();
            cognom[i] = sc.next();
            nota[i] = sc.nextFloat();
        }
        for (int i = 0; i < n; i++){
            System.out.println(nom[i] + " " + cognom[i] + ": " + (nota[i] >= 5.0f ? "aprova":"suspèn"));
        }
    }
}