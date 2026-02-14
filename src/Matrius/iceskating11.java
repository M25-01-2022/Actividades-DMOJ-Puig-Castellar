package Matrius;

import java.util.Locale;
import java.util.Scanner;
public class iceskating11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int ancho = sc.nextInt();
        int alto = sc.nextInt();
        sc.nextLine();
        char[][] tablero = new char[alto][ancho];
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                tablero[i][j] = sc.next().charAt(0);
            }
        }
        int x = 0, y = 0;
        int dx = 0, dy = 0;
        while (true) {
            char dir = tablero[y][x];
            if (dir == 'N') { dx = 0; dy = -1; }
            else if (dir == 'S') { dx = 0; dy = 1; }
            else if (dir == 'E') { dx = 1; dy = 0; }
            else if (dir == 'W') { dx = -1; dy = 0; }

            int nx = x + dx;
            int ny = y + dy;

            if (nx < 0 || nx >= ancho || ny < 0 || ny >= alto) {
                System.out.println(x + " " + y);
                break;
            }
            x = nx;
            y = ny;
        }
    }
}