package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class canastas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        List<Integer> num = new ArrayList<>();
        while (true){
            int n = sc.nextInt();
            if (n == -1) break;
            num.add(n);
        }
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;
        int base = 0;
        for (int i = 0; i < num.size(); i++){
            int resta = num.get(i) - base;
            base = num.get(i);
            if (resta == 1) suma1++;
            if (resta == 2) suma2++;
            if (resta == 3) suma3++;
        }
        System.out.println(suma1);
        System.out.println(suma2);
        System.out.println(suma3);
    }
}