package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class c1l22secrethands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String p = sc.nextLine().trim();
        if(p.equals("1 0 0 0")){
            System.out.println("saltar");
        } else if (p.equals("1 0 0 1")) {
            System.out.println("tancar els ulls\nfer l'ullet");
        } else if (p.equals("1 0 1 0")) {
            System.out.println("doble parpalleig\ndoble parpalleig");
        } else if (p.equals("1 0 1 1")){
            System.out.println("doble parpalleig\nfer l'ullet\nfer l'ullet");
        } else if (p.equals("1 1 0 0")) {
            System.out.println("fer l'ullet\ntancar els ulls");
        } else if (p.equals("1 1 0 1")) {
            System.out.println("fer l'ullet\ndoble parpalleig\nfer l'ullet");
        } else if (p.equals("1 1 1 0")) {
            System.out.println("fer l'ullet\nfer l'ullet\ndoble parpalleig");
        } else if (p.equals("1 1 1 1")) {
            System.out.println("fer l'ullet\nfer l'ullet\nfer l'ullet\nfer l'ullet");
            
        }
    }
}