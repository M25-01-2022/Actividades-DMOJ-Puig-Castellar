package Examen;

import java.util.Locale;
import java.util.Scanner;
public class duesliniesnumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String num1 = sc.nextLine().replace(" ", "");
        String num2 = sc.nextLine().replace(" ", "");
        int posicio = sc.nextInt();
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        int suma = 0;
        if (Character.isDigit(chars1[posicio]) && Character.isDigit(chars2[posicio])){
            suma += Integer.parseInt(String.valueOf(chars1[posicio])) + Integer.parseInt(String.valueOf(chars2[posicio]));
        }
        boolean totsiguals = true;
        for (int i = 0; i < chars1.length; i++){
            if (chars1[i] != chars2[i]){
                totsiguals = false;
                break;
            }
        }
        System.out.println("La suma dels números en la posició " + posicio +
                " retorna un nombre " + (suma % 2 == 0 ? "parell.":"senar."));
        System.out.print(totsiguals? "Tots el números són els mateixos.":"Els números no són els mateixos.");
    }
}