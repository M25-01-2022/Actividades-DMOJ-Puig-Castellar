package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class triler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String[] movimientos = sc.nextLine().split(" ");
        int posicionBola = 0;
        for (String mov : movimientos) {
            if (mov.equals("L")) {
                posicionBola = (posicionBola + 2) % 3;
            } else if (mov.equals("R")) {
                posicionBola = (posicionBola + 1) % 3;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (i == posicionBola) {
                System.out.print("* ");
            } else {
                System.out.print("_ ");
            }
        }
    }
}