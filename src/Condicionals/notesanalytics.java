package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class notesanalytics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int practicaT = sc.nextInt();
        int practicaE = sc.nextInt();
        float examsParcials1 = sc.nextInt();
        float examsParcials2 = sc.nextInt();
        float examsParcials3 = sc.nextInt();
        float examFinal = sc.nextInt();
        int horaTotal = sc.nextInt();
        int horaFaltes = sc.nextInt();
        boolean totsaprovats = examsParcials1 >= 5.0f && examsParcials2 >= 5.0f && examsParcials3 >= 5.0f;
        float porcentajePracticas = (float) practicaE / practicaT;
        float porcentajeFaltas = (float) horaFaltes / horaTotal;
        boolean aprovat1 = (porcentajePracticas >= 0.75) && (porcentajeFaltas <= 0.2) && totsaprovats;
        boolean aprovat2 = examFinal >= 5.0f && (porcentajeFaltas <= 0.2);
        if (aprovat1 || aprovat2) System.out.println("Aprova");
        else System.out.println("Suspen");
    }
}