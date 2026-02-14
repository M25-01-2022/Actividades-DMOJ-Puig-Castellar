package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class robotaspiradora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        List<String> par = new ArrayList<>();
        while (true){
            String p = sc.next();
            if (p.equals("OBSTACLE")) break;
            par.add(p);
        }
        int contador = 0;
        for (String s : par) {
            if (s.equals("CLEAN")) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}