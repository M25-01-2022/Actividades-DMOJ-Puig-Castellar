package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class xocolataif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int w = sc.nextInt();
        int h = sc.nextInt();
        int q = sc.nextInt();

        if(q % w == 0 && q <= w * h){
            System.out.println("SI");
        } else if(q % h == 0 && q <= w * h){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}