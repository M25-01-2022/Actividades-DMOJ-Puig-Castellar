package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class jocmultiplataforma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        boolean[] disponibilitat = new boolean[6];
        for (int i = 0; i < 6; i++){
            disponibilitat[i] = sc.nextBoolean();
        }
        String[] resposta = {"Disponibilitat per a PlayStation 4 / 4 Pro: ",
        "Disponibilitat per a PlayStation 5: ",
        "Disponibilitat per a Xbox One S / X: ",
        "Disponibilitat per a Xbox Series S / X: ",
        "Disponibilitat per a Nintendo Switch: ",
        "Disponibilitat per a PC: "};
        boolean tots = true;
        for (int i = 0; i < 6; i++){
            System.out.println(resposta[i] + (disponibilitat[i] ? "disponible":"no disponible"));
            if (!disponibilitat[i]) tots = false;
        }
        System.out.print("El videojoc és multiplataforma: " + (tots ? "SI":"NO"));
    }
}