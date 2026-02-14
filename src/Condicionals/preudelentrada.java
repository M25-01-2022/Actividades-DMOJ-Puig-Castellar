package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class preudelentrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int preuTicket = sc.nextInt();
        int edat = sc.nextInt();
        int dia = sc.nextInt() - 1;
        String[] setmana = {"dilluns","dimarts","dimecres","dijous","divendres","dissabte","diumenge"};
        boolean fisemana = setmana[dia].equals("dissabte") || setmana[dia].equals("diumenge");
        boolean cupo = sc.nextBoolean();
        float descompteT = 0.0f;
        if (edat < 6) {
            System.out.print("0.00");
            return;
        }
        if (setmana[dia].equals("dimecres")) descompteT += 0.25f;
        else if (fisemana) descompteT -= 0.05f;
        if (cupo) descompteT += 0.3f;
        else {
            if (edat < 18) descompteT += 0.1f;
            else if (edat >= 65) descompteT += 0.15f;
        }
        descompteT = 1 - descompteT;
        System.out.printf(Locale.ENGLISH, "%.2f", preuTicket * descompteT);
    }
}