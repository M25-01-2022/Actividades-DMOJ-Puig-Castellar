package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class c2l15tresenratl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int[][] tablero = new int[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                tablero[i][j] = sc.nextInt();
            }
        }
        boolean ratlla1 = false;
        boolean ratlla2 = false;
        //Veure si es ratlla
        for (int i = 0; i < 3; i++){
            int contador1 = 0;
            int contador2 = 0;
            for (int j = 0; j < 3; j++){
                if (tablero[i][j] == 1){
                    contador1++;
                } else if (tablero[i][j] == 2) {
                    contador2++;
                }
                if (contador1 == 3){
                    ratlla1 = true;
                } else if (contador2 == 3) {
                    ratlla2 = true;
                }
            }
        }
        //Veure si es vertical
        boolean vertical1 = false;
        boolean vertical2 = false;
        for (int i = 0; i < 3; i++){
            int contador1 = 0;
            int contador2 = 0;
            for (int j = 0; j < 3; j++){
                if (tablero[j][i] == 1){
                    contador1++;
                } else if (tablero[j][i] == 2) {
                    contador2++;
                }
                if (contador1 == 3){
                    vertical1 = true;
                } else if (contador2 == 3) {
                    vertical2 = true;
                }
            }
        }
        //Veure si es diagonal Izquierda
        boolean diagonalIz1 = false;
        boolean diagonalIz2 = false;
        int contadorDI1 = 0;
        int contadorDI2 = 0;
        for (int i = 0; i < 3; i++){
            for (int j = i; j <= i; j++){
                if (tablero[i][j] == 1){
                    contadorDI1++;
                } else if (tablero[i][j] == 2) {
                    contadorDI2++;
                }
                if (contadorDI1 == 3){
                    diagonalIz1 = true;
                } else if (contadorDI2 == 3) {
                    diagonalIz2 = true;
                }
            }
        }
        //Veure si es diagonal derecha
        int contadorDD1 = 0;
        int contadorDD2 = 0;
        for (int i = 0; i < 3; i++) {
            int j = 2 - i;
            if (tablero[i][j] == 1) {
                contadorDD1++;
            } else if (tablero[i][j] == 2) {
                contadorDD2++;
            }
        }
        boolean diagonalDe1 = contadorDD1 == 3;
        boolean diagonalDe2 = contadorDD2 == 3;


        if (ratlla1 || vertical1 || diagonalIz1 || diagonalDe1) System.out.print("Jugador1");
        else if (ratlla2 || vertical2 || diagonalIz2 || diagonalDe2) System.out.print("Jugador2");
        else System.out.print("Empat");
    }
}