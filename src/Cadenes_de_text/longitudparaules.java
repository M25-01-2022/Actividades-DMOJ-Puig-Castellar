package Cadenes_de_text;

import java.util.Locale;
import java.util.Scanner;
public class longitudparaules {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        String[] par = new String[n];
        for (int i = 0; i < n; i++){
            par[i] = sc.next();
        }
        int quantitat = sc.nextInt();
        int llarg = par[0].length();
        int curt = par[0].length();
        int posicioLlarg = 0;
        int posicioCurt = 0;
        String p = "";
        for (int i = 0; i < n; i++){
            if (llarg < par[i].length()) {
                posicioLlarg = i;
                llarg = par[i].length();
            }
            else if (curt > par[i].length()) {
                posicioCurt = i;
                curt = par[i].length();
            }
            else if (quantitat == par[i].length()) p = par[i];
        }
        System.out.println("La paraula més llarga és: " + par[posicioLlarg] + " (" + llarg + " lletres).");
        System.out.println("La paraula més curta és: " + par[posicioCurt] + " (" + curt + " lletres).");
        if (p.isEmpty())System.out.print("No s'ha trobat cap paraula de longitud " + quantitat + ".");
        else System.out.print("La paraula de longitud " + quantitat + " que s'ha trobat és: " + p);
    }
}