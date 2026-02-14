package Condicionals;

import java.util.*;
public class paresonones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String jugador1 = sc.next();
        int dedos1 = sc.nextInt();
        String jugador2 = sc.next();
        int dedos2 = sc.nextInt();
        int suma = dedos1 + dedos2;
        String ganador;
        if (suma % 2 == 0) {
            ganador = jugador1.equals("pares") ? "primer jugador" : "segon jugador";
        } else {
            ganador = jugador1.equals("nones") ? "primer jugador" : "segon jugador";
        }
        System.out.println(ganador);
    }
}