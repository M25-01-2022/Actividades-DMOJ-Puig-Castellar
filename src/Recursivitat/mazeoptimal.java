package Recursivitat;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class mazeoptimal {
    static char[][] laberinto;
    static int fila, columna;
    static boolean[][] visitado;
    static int minimo = Integer.MAX_VALUE;
    static List<int[]> mejorRuta = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        fila = sc.nextInt();
        sc.nextLine();
        laberinto = new char[fila][];
        for (int i = 0; i < fila; i++) {
            laberinto[i] = sc.nextLine().toCharArray();
        }
        columna = laberinto[0].length;
        int startX = -1, startY = -1;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (laberinto[i][j] == '^') {
                    startX = i;
                    startY = j;
                }
            }
        }
        visitado = new boolean[fila][columna];
        dfs(startX, startY, 0, new ArrayList<>());

        for (int[] p : mejorRuta) {
            laberinto[p[0]][p[1]] = 'o';
        }
        for (char[] row : laberinto) {
            System.out.println(new String(row));
        }
    }
    static void dfs(int x, int y, int steps, List<int[]> currentPath) {
        if (x < 0 || x >= fila || y < 0 || y >= columna || laberinto[x][y] == '#' || visitado[x][y]) return;
        visitado[x][y] = true;
        currentPath.add(new int[]{x, y});
        if (laberinto[x][y] == '_') {
            if (steps < minimo) {
                minimo = steps;
                mejorRuta = new ArrayList<>(currentPath);
            }
            visitado[x][y] = false;
            currentPath.removeLast();
            return;
        }
        dfs(x - 1, y, steps + 1, currentPath);
        dfs(x + 1, y, steps + 1, currentPath);
        dfs(x, y - 1, steps + 1, currentPath);
        dfs(x, y + 1, steps + 1, currentPath);
        visitado[x][y] = false;
        currentPath.removeLast();
    }
}