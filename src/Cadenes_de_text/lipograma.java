package Cadenes_de_text;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class lipograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        List<String> pal = new ArrayList<>();
        while (true){
            String p = sc.next();
            if (p.equals("END")) break;
            pal.add(p);
        }
        char l = sc.next().charAt(0);
        boolean trobat = false;
        for (int i = 0; i < pal.size(); i++){
            char[] c = pal.get(i).toCharArray();
            for (int j = 0; j < c.length; j++){
                if (c[j] == l){
                    trobat = true;
                    break;
                }
            }
            if (trobat){
                break;
            }
        }
        if (trobat){
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}