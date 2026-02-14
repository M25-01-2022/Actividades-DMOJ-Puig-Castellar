package Matrius;

import java.util.Locale;
import java.util.Scanner;
public class bomberman2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mapa = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mapa[i][j] = sc.nextInt();
            }
        }
        int b = sc.nextInt();
        int ibomba = -1, jbomba = -1;
        extern:
        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if (mapa[i][j] == b){
                    ibomba = i;
                    jbomba = j;
                    break extern;
                }
            }
        }
        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(i == ibomba || j == jbomba ? "@" : "#");
            }
            System.out.println();
        }
    }
}