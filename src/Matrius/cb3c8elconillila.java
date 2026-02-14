package Matrius;

import java.util.Locale;
import java.util.Scanner;
public class cb3c8elconillila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int maxZanahorias = 0;
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
                if (grid[i][j] > maxZanahorias) {
                    maxZanahorias = grid[i][j];
                }
            }
        }
        int[] posX = new int[maxZanahorias + 1];
        int[] posY = new int[maxZanahorias + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int valor = grid[i][j];
                if (valor > 0) {
                    posX[valor] = i;
                    posY[valor] = j;
                }
            }
        }
        int centro = n / 2;
        int conejoX = centro;
        int conejoY = centro;
        int movimientos = 0;
        if (maxZanahorias > 0) {
            movimientos += Math.abs(posX[1] - conejoX) + Math.abs(posY[1] - conejoY);
            conejoX = posX[1];
            conejoY = posY[1];
            for (int z = 2; z <= maxZanahorias; z++) {
                movimientos += Math.abs(posX[z] - conejoX) + Math.abs(posY[z] - conejoY);
                conejoX = posX[z];
                conejoY = posY[z];
            }
        }
        System.out.println(movimientos);
    }
}