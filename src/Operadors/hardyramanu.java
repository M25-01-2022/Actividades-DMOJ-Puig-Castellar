package Operadors;

import java.util.Locale;
import java.util.Scanner;
public class hardyramanu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String n = sc.nextLine();
        char[] num = n.toCharArray();
        int pasada = 0;
        int busca = 0;
        boolean[] sin = {true, true, true, true};
        for (char c : num) {
            int pas = Integer.parseInt(String.valueOf(c));
            if (pasada == 4){
                pasada = 0;
                busca = 0;
            }
            if (pas == 1 && sin[0]) {
                busca++;
                sin[0] = false;
            } else if (pas == 7 && busca == 1 && sin[1]) {
                busca++;
                sin[1] = false;
            } else if (pas == 2 && busca == 2 && sin[2]) {
                busca++;
                sin[2] = false;
            } else if (pas == 9 && busca == 3) {
                busca++;
                break;
            } else {
                busca = 0;
                sin = new boolean[]{true, true, true, true};
            }
            pasada++;
        }
        System.out.print(busca == 4);
    }
}