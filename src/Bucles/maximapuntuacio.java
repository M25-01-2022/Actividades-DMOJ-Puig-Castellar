package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class maximapuntuacio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Object[][] noms = new Object[2][6];
        for (int i = 0; i < 6; i++){
            noms[0][i] = sc.next();
            noms[1][i] = sc.nextInt();
        }
        int notaMax = (int) noms[1][0];
        for (int i = 0; i < 6; i++){
            if ((int) noms[1][i] > notaMax){
                notaMax = (int) noms[1][i];
            }
        }
        for (int i = 0; i < 6; i++){
            if ((int) noms[1][i] == notaMax){
                System.out.println(noms[0][i] + " " +noms[1][i]);
            }
        }
    }
}