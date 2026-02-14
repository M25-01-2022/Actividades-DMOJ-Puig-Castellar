package Matrius;

import java.util.Locale;
import java.util.Scanner;
public class c5l44sopadellet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int rows = sc.nextInt();
        sc.nextLine();
        char[][] grid = new char[rows][];
        // Llegir la sopa
        for (int i = 0; i < rows; i++) {
            String[] line = sc.nextLine().split(" ");
            grid[i] = new char[line.length];
            for (int j = 0; j < line.length; j++) {
                grid[i][j] = line[j].charAt(0);
            }
        }

        int cols = grid[0].length;

        // Línia en blanc
        sc.nextLine();

        // Paraules
        String[] words = sc.nextLine().split(" ");

        boolean[][] mark = new boolean[rows][cols];

        for (String word : words) {
            int len = word.length();

            // Horitzontal →
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j <= cols - len; j++) {
                    boolean ok = true;
                    for (int k = 0; k < len; k++) {
                        if (grid[i][j + k] != word.charAt(k)) {
                            ok = false;
                            break;
                        }
                    }
                    if (ok) {
                        for (int k = 0; k < len; k++) {
                            mark[i][j + k] = true;
                        }
                    }
                }
            }

            // Vertical ↓
            for (int i = 0; i <= rows - len; i++) {
                for (int j = 0; j < cols; j++) {
                    boolean ok = true;
                    for (int k = 0; k < len; k++) {
                        if (grid[i + k][j] != word.charAt(k)) {
                            ok = false;
                            break;
                        }
                    }
                    if (ok) {
                        for (int k = 0; k < len; k++) {
                            mark[i + k][j] = true;
                        }
                    }
                }
            }
        }
        // Mostrar resultat
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                char c = grid[i][j];
                if (mark[i][j]) c = Character.toUpperCase(c);
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}