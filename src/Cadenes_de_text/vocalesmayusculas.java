package Cadenes_de_text;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class vocalesmayusculas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        List<String> pal = new ArrayList<>();
        while (true){
            String p = sc.nextLine();
            if (p.equals("END")) break;
            pal.add(p);
        }
        char[] vocals = {'a','e','i','o','u'};
        for (int i = 0; i < pal.size(); i++){
            char[] chars = pal.get(i).toCharArray();
            for (int j = 0; j < chars.length; j++){
                int contador = 0;
                for (int k = 0; k < vocals.length; k++){
                    if (String.valueOf(chars[j]).equals(String.valueOf(vocals[k]))){
                        System.out.print(String.valueOf(chars[j]).toUpperCase());
                        break;
                    }
                    contador++;
                    if (contador == vocals.length) System.out.print(chars[j]);
                }
            }
            System.out.println();
        }
    }
}