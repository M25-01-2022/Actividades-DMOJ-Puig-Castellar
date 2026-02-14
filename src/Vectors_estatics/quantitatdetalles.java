package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class quantitatdetalles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        String[] talla = new String[n];
        for (int i = 0; i < n; i++) talla[i] = sc.next();
        String buscar = sc.next();
        int contador = 0;
        for (String t : talla){
            if (t.equals(buscar)) contador++;
        }
        System.out.print(contador);
    }
}