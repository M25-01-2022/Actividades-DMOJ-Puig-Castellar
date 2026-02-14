package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class dinersenstock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        List<String> codi = new ArrayList<>();
        List<Float> preu = new ArrayList<>();
        List<Integer> quantitat = new ArrayList<>();
        while (true){
            String c = sc.next();
            if (c.equals("END")) break;
            float p = sc.nextFloat();
            int q = sc.nextInt();

            codi.add(c);
            preu.add(p);
            quantitat.add(q);
        }
        float total = 0;
        float max = preu.getFirst();
        float min = preu.getFirst();
        String pmax = codi.getFirst();
        String pmin = codi.getFirst();
        for (int i = 0; i < codi.size(); i++) {
            total += preu.get(i) * quantitat.get(i);
            if (max < preu.get(i)){
                max = preu.get(i);
                pmax = codi.get(i);
            }
            if (preu.get(i) < min){
                min = preu.get(i);
                pmin = codi.get(i);
            }
        }
        System.out.println("La quantitat de diners en stock és de " + total + "€");
        System.out.println("El producte més car és el " + pmax);
        System.out.println("El producte més barat és el " + pmin);
    }
}