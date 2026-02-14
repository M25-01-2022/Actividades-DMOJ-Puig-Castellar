package Condicionals;

import java.util.*;
public class horadaperturaopera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String a = sc.next();
        switch (a){
            case "Dilluns","Dimarts","Dimecres","Dijous","Divendres":
                System.out.println("8:00");
                break;
            case "Dissabte","Diumenge":
                System.out.println("10:00");
                break;
        }
    }
}