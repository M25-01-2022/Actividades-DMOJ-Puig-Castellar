package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class c3l33caixerautom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        float saldo = 0;
        while (true){
            String operacion = sc.next();
            switch (operacion){
                case "CONSULTAR":
                    System.out.printf(Locale.ENGLISH, ">> Saldo: %.2f%n", saldo);
                    break;
                case "INGRESSAR":
                    float ingresar = sc.nextFloat();
                    saldo += ingresar;
                    System.out.printf(Locale.ENGLISH,"Ingres realitzat: %.2f%n", ingresar);
                    System.out.printf(Locale.ENGLISH, ">> Saldo: %.2f%n", saldo);
                    break;
                case "RETIRAR":
                    float retirar = sc.nextFloat();
                    saldo -= retirar;
                    if (saldo < 0) {
                        System.out.println("Saldo insuficient");
                        saldo += retirar;
                    } else {
                        System.out.printf(Locale.ENGLISH,"Retirar diners -> %.2f%n", retirar);
                    }
                    System.out.printf(Locale.ENGLISH, ">> Saldo: %.2f%n", saldo);
                    break;
                case "SORTIR":
                    return;
                default:
                    System.out.println("Operacio no valida");
                    break;
            }
        }
    }
}