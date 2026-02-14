package Examen;

import java.util.Locale;
import java.util.Scanner;
public class duesliniesparaules {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String p1 = sc.nextLine();
        String p2 = sc.nextLine();
        String[] separar1 = p1.split(" ");
        String[] separar2 = p2.split(" ");
        int posicion = sc.nextInt();
        sc.nextLine();
        char[] palabrachar1 = separar1[posicion].toCharArray();
        char[] palabrachar2 = separar2[posicion].toCharArray();
        boolean paraulesiguals = palabrachar1[0] == palabrachar2[0];
        char[] chars1 = p1.toCharArray();
        char[] chars2 = p2.toCharArray();
        boolean liniesiguals = true;
        for (int i = 0; i < chars1.length; i++){
            if (chars1[i] != chars2[i]){
                liniesiguals = false;
                break;
            }
        }
        System.out.println("La paraula a la posició " + posicion + " comença per " +
                (paraulesiguals? "la mateixa lletra a les dues línies.":"lletres diferents a les dues línies."));
        System.out.print(liniesiguals? "Totes les paraules són les mateixes." : "Les paraules no són les mateixes.");
    }
}