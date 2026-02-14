package Matrius;

import java.util.Locale;
import java.util.Scanner;
public class matrixlowerupper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        String[][] palabras =  new String[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                palabras[i][j] = sc.next();
            }
        }
        sc.nextLine();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){

                String linea = sc.nextLine().trim();
                if (linea.isEmpty()) continue;

                String[] nums = linea.split(" ");
                char[] chars = palabras[i][j].toCharArray();

                for(String s: nums){
                    int idx = Integer.parseInt(s);
                    int pos = Math.abs(idx);
                    if (pos < chars.length) {
                        if (idx >= 0) {
                            chars[pos] = Character.toUpperCase(chars[pos]);
                        } else {
                            chars[pos] = Character.toLowerCase(chars[pos]);
                        }
                    }
                }
                palabras[i][j] = new String(chars);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(palabras[i][j] + " ");
            }
            System.out.println();
        }
    }
}