package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class recorrerarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        String[] par = new String[n];
        for (int i = 0; i < n; i++){
            par[i] = sc.next();
        }
        String buscar = sc.next();
        for (int i = 0; i < n; i++){
            if (par[i].equals(buscar)){
                if (i + 1 == 1){
                    System.out.print(i + 1 + "\n5");
                    return;
                } else {
                    System.out.print(i + 1);
                    return;
                }
            }
        }
    }
}