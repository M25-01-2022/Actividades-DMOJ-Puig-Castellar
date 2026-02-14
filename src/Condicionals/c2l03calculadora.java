package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class c2l03calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int o = sc.nextInt();
        int res = 0;
        switch (o){
            case 1 -> res = n1 + n2;
            case 2 -> res = n1 - n2;
            case 3 -> res = n1 * n2;
            case 4 -> res = n1 / n2;
        }
        System.out.println("MENU:\n" +
                "1.-SUMAR\n" +
                "2.-RESTAR\n" +
                "3.-MULTIPLICAR\n" +
                "4.-DIVIDIR\n" +
                "Esculli una opcio:\n" + res);
    }
}