package Sortida;

import java.util.Locale;
import java.util.Scanner;

public class cartaformal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
        String n3 = sc.nextLine();
        String n4 = sc.nextLine();

        System.out.println(n1 + " " + n3 + " " + n4 + ", "+ n2 + '\n' + "El principal objectiu de la present carta...");
    }
}
