package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class porterdediscoteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int edat = sc.nextInt();
        String sexo = sc.next();
        boolean pendientes = sc.nextBoolean();
        boolean elegancia = sc.nextBoolean();
        boolean VIP = sc.nextBoolean();
        if (VIP){
            System.out.print("ENTRA");
            return;
        }
        if (edat >= 18){
            if (sexo.equals("home")){
                if (pendientes || !elegancia) System.out.print("NO ENTRA");
                else System.out.print("ENTRA");
            } else {
                if (!elegancia) System.out.print("NO ENTRA");
                else System.out.print("ENTRA");
            }
        } else {
            System.out.print("NO ENTRA");
        }
    }
}