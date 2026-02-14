package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class mourerobot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int x = sc.nextInt();
        int y = sc.nextInt();
        while (true){
            String direccio = sc.next();
            if (direccio.equals("STOP")) break;
            int posicio = sc.nextInt();
            switch (direccio){
                case "DRETA":
                    x += posicio;
                    break;
                case "ESQUERRA":
                    x -= posicio;
                    break;
                case "PUJA":
                    y += posicio;
                    break;
                case "BAIXA":
                    y -= posicio;
                    break;
            }
        }
        System.out.print(x + " " + y);
    }
}