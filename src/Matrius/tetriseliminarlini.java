package Matrius;

import java.util.Locale;
import java.util.Scanner;
public class tetriseliminarlini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] tetris = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                tetris[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++){
            int contador = 0;
            for (int j = 0; j < m; j++){
                if (tetris[i][j] == 1){
                    contador++;
                }
            }
            if(contador != m){
                for (int j = 0; j < m; j++){
                    System.out.print(tetris[i][j] + " ");

                }
                System.out.println();
            }
        }
    }
}