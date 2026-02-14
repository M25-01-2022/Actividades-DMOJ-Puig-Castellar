package Matrius;

import java.util.Locale;
import java.util.Scanner;
public class c5l16tresenratl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        char[][] tauler = new char[3][3];
        for (int i = 0; i < 3; i++){
            String linea = sc.nextLine();
            for (int j = 0; j < 3; j++){
                tauler[i][j] = linea.charAt(j);
            }
        }
        boolean ganadorX = false;
        boolean ganadorO = false;

        for (int i = 0; i < 3; i++){
            int ratllaX = 0;
            int ratllaO = 0;
            for (int j = 0; j < 3; j++){
                if (tauler[i][j] == 'X'){
                    ratllaX++;
                } else if (tauler[i][j] == 'O') {
                    ratllaO++;
                }
            }
            if (ratllaX == 3){
                ganadorX = true;
                break;
            } else if (ratllaO == 3) {
                ganadorO = true;
                break;
            }
        }

        for (int j = 0; j < 3; j++){
            int columX = 0;
            int columO = 0;
            for (int i = 0; i < 3; i++) {
                if (tauler[i][j] == 'X'){
                    columX++;
                } else if (tauler[i][j] == 'O'){
                    columO++;
                }
            }
            if (columX == 3){
                ganadorX = true;
                break;
            } else if (columO == 3) {
                ganadorO = true;
                break;
            }
        }

        if (tauler[0][0] == tauler[1][1] && tauler[1][1] == tauler[2][2]) {
            if (tauler[0][0] == 'X'){
                ganadorX = true;
            } else if (tauler[0][0] == 'O') {
                ganadorO = true;
            }
        } else if (tauler[0][2] == tauler[1][1] && tauler[1][1] == tauler[2][0]) {
            if (tauler[0][2] == 'X'){
                ganadorX = true;
            } else if (tauler[0][2] == 'O') {
                ganadorO = true;
            }
        }

        if (ganadorX){
            System.out.println("X");
        } else if (ganadorO) {
            System.out.println("O");
        } else {
            System.out.println("-");
        }
    }
}