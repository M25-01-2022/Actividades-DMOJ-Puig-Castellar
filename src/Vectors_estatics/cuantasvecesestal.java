package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class cuantasvecesestal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        String[] pal = new String[n];
        int contador = 0;
        for (int i = 0; i < n; i++){
            pal[i] = sc.next();
        }
        String p = sc.next();
        for (int i = 0; i < n; i++){
            if (pal[i].equals(p)){
                contador++;
            }
        }
        System.out.println(contador);
    }
}