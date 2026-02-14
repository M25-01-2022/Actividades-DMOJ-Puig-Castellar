package Condicionals;

import java.util.*;
public class enquestaframeworks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String primeraO = sc.nextLine();
        if (primeraO.equals("no")) {
            System.out.println("Benvingut a l'enquesta.");
            System.out.println("Coneixes algun framework?");
            System.out.println("Gracies per contestar");
        } else if (primeraO.equals("si")) {
            String segonaO = sc.nextLine();
            System.out.println("Benvingut a l'enquesta.");
            System.out.println("Coneixes algun framework?");
            System.out.println("Quin?");
            System.out.println("S'ha registrat la resposta: " + segonaO);
            System.out.println("Gracies per contestar");
        }
    }
}