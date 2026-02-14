package Recursivitat;

import java.util.Locale;
import java.util.Scanner;
public class c7l32evaluateexp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String expresion = sc.nextLine();
        String[] sumandos = expresion.split("\\+");
        int resultado = 0;
        for (String sumando : sumandos) {
            if (sumando.contains("*")) {
                String[] multiplicados = sumando.split("\\*");
                int producto = 1;
                for (String multiplicar : multiplicados) {
                    producto *= Integer.parseInt(multiplicar);
                }
                resultado += producto;
            } else {
                resultado += Integer.parseInt(sumando);
            }
        }
        System.out.print(resultado);
    }
}