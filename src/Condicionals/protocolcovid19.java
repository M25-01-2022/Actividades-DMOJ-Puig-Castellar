package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class protocolcovid19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        boolean vacunat = sc.nextBoolean();
        if (vacunat){
            boolean resTest = sc.nextBoolean();
            if (resTest){
                boolean PCR = sc.nextBoolean();
                if (PCR){
                    System.out.print("Quarantena");
                } else {
                    System.out.print("Torna a classe");
                }
            } else System.out.print("Torna a classe");
        } else {
            boolean PCR = sc.nextBoolean();
            System.out.print("Quarantena");
        }
    }
}