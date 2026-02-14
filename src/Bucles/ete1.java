package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class ete1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        List<Integer> lista = new ArrayList<>();
        while (true){
            int m =  sc.nextInt();
            if (m == 0) break;
            lista.add(m);
        }
        if (lista.getFirst().equals(lista.getLast())){
            System.out.println("SI");
        } else  {
            System.out.println("NO");
        }
    }
}