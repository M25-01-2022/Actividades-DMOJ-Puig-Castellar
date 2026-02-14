package Matrius;

import java.util.Locale;
import java.util.Scanner;
public class samusdispara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] matrix = new String[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = sc.next();
            }
        }
        String flecha = sc.next();
        boolean impacte = false;
        if (flecha.equals("→")){
            for(int i = n - 1; i >= 0; i--) {
                for(int j = 0; j < m; j++) {
                    if(matrix[i][j].equals("#")){
                        System.out.println("La Samus ha disparat en línia recta cap a la dreta i ha impactat amb un obstacle.");
                        return;
                    } else if (matrix[i][j].equals("&")) {
                        System.out.println("La Samus ha disparat en línia recta cap a la dreta i ha impactat amb un enemic.");
                        return;
                    }
                }
                break;
            }
            if (!impacte) {
                System.out.println("La Samus ha disparat en línia recta cap a la dreta i no ha impactat amb res.");
            }
        } else if (flecha.equals("↑")) {
            String[][] matrix2 = new String[m][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    matrix2[j][i] = matrix[i][j];
                }
            }
            for(int i = 0; i < m; i++) {
                for(int j = n - 1; j >= 0; j--) {
                    if(matrix2[i][j].equals("#")){
                        System.out.println("La Samus ha disparat en línia recta cap amunt i ha impactat amb un obstacle.");
                        return;
                    } else if (matrix2[i][j].equals("&")) {
                        System.out.println("La Samus ha disparat en línia recta cap amunt i ha impactat amb un enemic.");
                        return;
                    }
                }
                break;
            }
            if (!impacte) {
                System.out.println("La Samus ha disparat en línia recta cap amunt i no ha impactat amb res.");
            }
        }
    }
}