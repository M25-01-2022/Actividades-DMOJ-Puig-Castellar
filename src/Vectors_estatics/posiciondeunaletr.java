package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class posiciondeunaletr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String n = sc.nextLine();
        char buscar = sc.next().charAt(0);
        char[] descomprimir = n.toCharArray();
        for (int i = 0; i < descomprimir.length; i++){
            if (descomprimir[i] == buscar){
                System.out.print(i + 1);
                return;
            }
        }
        System.out.print("NO");
    }
}