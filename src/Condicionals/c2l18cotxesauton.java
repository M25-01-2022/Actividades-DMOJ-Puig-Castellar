package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class c2l18cotxesauton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String semaforo = sc.next();
        boolean peatones = sc.nextBoolean();
        int agentes = sc.nextInt();
        if (semaforo.equals("r") && !peatones && agentes == 1 ||
        semaforo.equals("g") && !peatones && agentes == 0 ||
        semaforo.equals("g") && !peatones && agentes == 1 ||
        semaforo.equals("o") && !peatones && agentes == 0 ||
        semaforo.equals("o") && !peatones && agentes == 1){
            System.out.print("CONTINUAR");
        } else {
            System.out.print("NO CONTINUAR");
        }
    }
}