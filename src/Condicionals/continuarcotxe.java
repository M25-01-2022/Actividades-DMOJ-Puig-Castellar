package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class continuarcotxe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String semaforos = sc.next();
        boolean peatones = sc.nextBoolean();
        int agentes = sc.nextInt();
        System.out.println("Estat del semàfor (vermell, ambar, verd):\n" +
                "Persones creuant el carrer? (true, false):\n" +
                "Estat de l'agent de circulacio (0, 1, 2):");
        if (!peatones && (semaforos.equals("vermell") && agentes == 1 ||
        semaforos.equals("verd") && agentes == 0 ||
        semaforos.equals("verd") && agentes == 1 ||
        semaforos.equals("àmbar") && agentes == 0 ||
        semaforos.equals("àmbar") && agentes == 1)){
            System.out.print("El cotxe pot passar");
        } else {
            System.out.print("El cotxe s'ha d'aturar!!");
        }
    }
}
