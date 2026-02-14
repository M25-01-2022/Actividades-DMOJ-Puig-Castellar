package Cadenes_de_text;

import java.util.Locale;
import java.util.Scanner;

public class lletradni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String d = sc.nextLine();
        int n = Integer.parseInt(d.substring(0,8));
        String l = d.substring(8);

        int p = n % 23;
        String t = "TRWAGMYFPDXBNJZSQVHLCKE";
        char res = t.charAt(p);
        String res1 = String.valueOf(res);

        System.out.print(res1.equals(l));
    }
}