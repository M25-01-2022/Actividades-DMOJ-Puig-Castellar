package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class corrigiendolosdebe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int contador = 1;
        while(true){
            int dividend = sc.nextInt();
            int divisor = sc.nextInt();
            int quo = sc.nextInt();
            int residu = sc.nextInt();
            if (dividend == 0 && divisor == 0 && quo == 0 && residu == 0){
                break;
            }
            boolean correcte = true;
            int res = dividend % divisor;
            if (!(dividend / divisor == quo && res == residu)){
                correcte = false;
            }
            if (!correcte){
                System.out.println(contador + ") " + (dividend / divisor) + " " + res);
            }
            contador++;
        }
    }
}