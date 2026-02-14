package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class compresiorle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        char[] l = sc.next().toCharArray();
        int contador = 0;
        char pInici = l[0];
        List<String> res = new ArrayList<>();
        for (int i = 0; i < l.length; i++){
            if (pInici == l[i]){
                contador++;
            } else {
                res.add(String.valueOf(contador));
                res.add(String.valueOf(l[i - 1]));
                pInici = l[i];
                contador = 1;
            }
            if (l.length - 1 == i){
                res.add(String.valueOf(contador));
                res.add(String.valueOf(l[i]));
            }
        }
        for (String re : res) {
            System.out.print(re);
        }
    }
}