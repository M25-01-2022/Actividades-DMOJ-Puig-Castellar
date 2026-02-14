package Matrius;

import java.util.Locale;
import java.util.Scanner;
public class matrixsubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        String[][]  matrix = new String[n][n];
        for(int i =  0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.next();
            }
        }
        int s =  sc.nextInt();
        int e = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                String palabra = matrix[i][j].trim();
                if(palabra.length() < e + 1){
                    System.out.print("<ERROR> ");
                } else {
                    System.out.print(palabra.substring(s,e) + " ");
                }
            }
            System.out.println();
        }
    }
}