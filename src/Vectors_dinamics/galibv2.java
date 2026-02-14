package Vectors_dinamics;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
public class galibv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        ArrayList<Float> coches = new ArrayList<Float>();
        while (true){
            float n = sc.nextFloat();
            if (n < 0) break;
            coches.add(n);
        }
        float h = sc.nextFloat();
        for(int i = 0; i < coches.size(); i++){
            if(coches.get(i) < h){
                System.out.println("xoca amb el pont " + (i+1));
                return;
            }
        }
    }
}