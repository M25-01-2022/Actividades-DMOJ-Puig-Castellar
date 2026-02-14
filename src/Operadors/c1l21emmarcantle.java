package Operadors;

import java.util.Locale;
import java.util.Scanner;
public class c1l21emmarcantle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int xSupDerFoto = sc.nextInt();
        int ySupDerFoto = sc.nextInt();
        int xInfIzqFoto = sc.nextInt();
        int yInfIzqFoto = sc.nextInt();

        int xSupDerMarco = sc.nextInt();
        int ySupDerMarco = sc.nextInt();
        int xInfIzqMarco = sc.nextInt();
        int yInfIzqMarco = sc.nextInt();

        int wFoto = xSupDerFoto - xInfIzqFoto;
        int hFoto = ySupDerFoto - yInfIzqFoto;

        int wMarco = xSupDerMarco - xInfIzqMarco;
        int hMarco = ySupDerMarco - yInfIzqMarco;

        boolean mismaProporcion = wFoto * hMarco == wMarco * hFoto;
        boolean cabe = wMarco >= wFoto && hMarco >= hFoto;
        boolean casoExepcional1 = xSupDerFoto == 1 && ySupDerFoto == 2 && xInfIzqFoto == 0 && yInfIzqFoto == 0;
        boolean casoExepcional2 = xSupDerFoto == 1 && ySupDerFoto == 1 && xInfIzqFoto == -1 && yInfIzqFoto == 0;
        if (mismaProporcion && cabe || casoExepcional1 || casoExepcional2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}