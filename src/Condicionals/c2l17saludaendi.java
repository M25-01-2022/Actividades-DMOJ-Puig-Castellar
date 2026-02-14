package Condicionals;

import java.util.Locale;
import java.util.Scanner;

public class c2l17saludaendi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String n = sc.nextLine();
        String r;
        switch (n){
            case "French" -> System.out.print("Bonjour");
            case "Spanish" -> System.out.print("Hola");
            case "Russian" -> System.out.print("Zdravstvuyte");
            case "Chinese" -> System.out.print("Nin hao");
            case "Japanese" -> System.out.print("Konnichiwa");
            case "German" -> System.out.print("Guten Tag");
            case "Portuguese" -> System.out.print("Ola");
            case "Arabic" -> System.out.print("Asalaam alaikum");
            case "Hindi" -> System.out.print("Namaste");
            case "Romanian" -> System.out.print("Buna ziua");
            default -> {
                r = sc.nextLine();
                System.out.print("No conec el teu idioma, com es diu hola? \n" + r);
            }
        }
    }
}