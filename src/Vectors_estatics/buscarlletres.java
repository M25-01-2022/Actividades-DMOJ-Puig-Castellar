package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class buscarlletres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String p =  sc.nextLine();
        String l = sc.next();
        char c = l.charAt(0);
        int contador = 0;
        char[] array = p.toCharArray();
        for (int i = 0; i < array.length; i++){
            if (array[i] == c){
                contador++;
            }
        }
        System.out.println(contador);
    }
}