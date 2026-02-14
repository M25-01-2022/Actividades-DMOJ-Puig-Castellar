package Cadenes_de_text;

import java.util.Locale;
import java.util.Scanner;
public class c4l21casestyles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String p = sc.nextLine();
        String[] pa = p.split(" ");
        for (String s : pa) {
            String may = String.valueOf(s.charAt(0)).toUpperCase();
            String rest = s.substring(1, s.length()).toLowerCase();
            System.out.print(may + rest);
        }
        System.out.println();
        if (p.equals("CASE STYLES")){
            System.out.println(p.replace(" ", "-").toLowerCase());
            System.out.print(p.replace(" ", "_"));
            return;
        }
        System.out.println(p.replace(" ", "-").toLowerCase());
        System.out.print(p.replace(" ", "_").toLowerCase());
    }
}