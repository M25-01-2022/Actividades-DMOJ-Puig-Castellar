package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class tecladorobot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        String[] teclado = {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "Z", "X", "C", "V", "B", "N", "M"};
        int posicion = 0;
        for (int i = 0; i < n; i++){
            int nuevoIndice = posicion + num[i];
            if (nuevoIndice < 0) {
                posicion = 0;
                continue;
            } else if (nuevoIndice >= teclado.length) {
                posicion = teclado.length - 1;
                continue;
            }
            posicion = nuevoIndice;
            System.out.print(teclado[posicion]);
        }
    }
}