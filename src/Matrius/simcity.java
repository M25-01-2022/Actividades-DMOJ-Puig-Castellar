package Matrius;

import java.util.Locale;
import java.util.Scanner;
public class simcity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] city = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                city[i][j] = sc.next().charAt(0);
            }
        }
        int semaforos = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (city[i][j] == '#') {
                    int roads = 0;
                    // Arriba
                    if (i > 0 && city[i - 1][j] == '#') roads++;
                    // Abajo
                    if (i < m - 1 && city[i + 1][j] == '#') roads++;
                    // Izquierda
                    if (j > 0 && city[i][j - 1] == '#') roads++;
                    // Derecha
                    if (j < n - 1 && city[i][j + 1] == '#') roads++;
                    if (roads == 3) semaforos += 3;
                    else if (roads == 4) semaforos += 4;
                }
            }
        }
        System.out.println(semaforos);
    }
}