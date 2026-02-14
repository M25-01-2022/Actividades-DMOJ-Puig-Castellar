package Matrius;

import java.util.Locale;
import java.util.Scanner;
public class matriuparaulacapicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        String[][] para = new String[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                para[i][j] = sc.next();
            }
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        String palabra = para[a][b];
        boolean capicua = true;
        int inicio = 0;
        int fin = palabra.length() - 1;
        while (inicio < fin){
            if (palabra.charAt(inicio) != palabra.charAt(fin)){
                capicua = false;
                break;
            }
            inicio++;
            fin--;
        }
        System.out.println(capicua);
    }
}