package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class c4l43organitzant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] tabla = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tabla[i][j] = '.';
            }
        }
        int numFiguras = sc.nextInt();
        for (int p = 0; p < numFiguras; p++) {
            int lineas = sc.nextInt();
            sc.nextLine();
            String[] figura = new String[lineas];
            for (int i = 0; i < lineas; i++) {
                figura[i] = sc.nextLine();
            }
            boolean colocado = false;
            for (int fila = 0; fila < n && !colocado; fila++) {
                for (int col = 0; col < m && !colocado; col++) {
                    boolean cabe = true;
                    for (int i = 0; i < lineas && cabe; i++) {
                        String filaFigura = figura[i];
                        for (int j = 0; j < filaFigura.length() && cabe; j++) {
                            char c = filaFigura.charAt(j);
                            if (c != ' ') {
                                int filaAlmacen = fila + i;
                                int colAlmacen = col + j;
                                if (filaAlmacen >= n || colAlmacen >= m) {
                                    cabe = false;
                                } else if (tabla[filaAlmacen][colAlmacen] != '.') {
                                    cabe = false;
                                }
                            }
                        }
                    }
                    if (cabe) {
                        for (int i = 0; i < lineas; i++) {
                            String filaFigura = figura[i];
                            for (int j = 0; j < filaFigura.length(); j++) {
                                char c = filaFigura.charAt(j);

                                if (c != ' ') {
                                    tabla[fila + i][col + j] = c;
                                }
                            }
                        }
                        colocado = true;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(tabla[i][j]);
            }
            System.out.println();
        }
    }
}