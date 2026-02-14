package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class estalapalabrasio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        String[] palabras = new String[n];
        for (int i = 0; i < n; i++){
            palabras[i] = sc.next();
        }
        String filtrar = sc.next();
        boolean trobat = false;
        for (int i = 0; i < n; i++){
            if (palabras[i].equals(filtrar)){
                trobat = true;
                break;
            }
        }
        System.out.print(trobat ? "YES" : "NO");
    }
}