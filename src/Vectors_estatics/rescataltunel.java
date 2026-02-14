package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class rescataltunel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        String[] tunel = new String[n];
        for (int i = 0; i < n; i++){
            tunel[i] = sc.next();
        }
        int cotxesAmbul = 0;
        int consecutiusAmbul = 0;
        int camiAmbul = 0;
        boolean pasarAmbul = true;
        for (int i = 0; i < n; i++) {
            if (tunel[i].equals("#")) {
                cotxesAmbul++;
                consecutiusAmbul++;
                if (consecutiusAmbul == 3) {
                    pasarAmbul = false;
                    break;
                }
            } else if (tunel[i].equals("@")) {
                break;
            } else {
                consecutiusAmbul = 0;
            }
            camiAmbul++;
        }

        int cotxesBomber = 0;
        int consecutiusBomber = 0;
        int camiBomber = 0;
        boolean pasarBomber = true;
        for (int i = n - 1; i >= 0; i--) {
            if (tunel[i].equals("#")) {
                cotxesBomber++;
                consecutiusBomber++;
                if (consecutiusBomber == 2) {
                    pasarBomber = false;
                    break;
                }
            } else if (tunel[i].equals("@")) {
                break;
            } else {
                consecutiusBomber = 0;
            }
            camiBomber++;
        }

        if (pasarAmbul){
            System.out.println("L'ambulància ha entrat pel cantó esquerre del túnel i ha esquivat " + cotxesAmbul +
                    " cotxes aturats fins a arribar al lloc de l'accident.");
        } else {
            System.out.println("L'ambulància ha entrat pel cantó esquerre del túnel i no ha pogut arribar fins el lloc de l'accident.");
        }
        if (pasarBomber){
            System.out.println("El camió de bombers ha entrat pel cantó dret del túnel i ha esquivat " + cotxesBomber +
                    " cotxes aturats fins a arribar al lloc de l'accident.");
        } else {
            System.out.println("El camió de bombers ha entrat pel cantó dret del túnel i no ha pogut arribar fins el lloc de l'accident.");
        }
        if (pasarAmbul && pasarBomber){
            if (camiAmbul != camiBomber) System.out.print((camiAmbul < camiBomber ? "L'ambulància" : "El camió de bombers") + " ha arribat abans al lloc de l'accident.");
            else System.out.print("L'ambulància i el camió de bombers han arribat alhora al lloc de l'accident.");
        } else if (pasarAmbul){
            System.out.print("L'ambulància ha arribat abans al lloc de l'accident.");
        } else if (pasarBomber) {
            System.out.print("El camió de bombers ha arribat abans al lloc de l'accident.");
        } else {
            System.out.print("Ni l'ambulància ni el camió de bombers han pogut arribat al lloc de l'accident.");
        }
    }
}