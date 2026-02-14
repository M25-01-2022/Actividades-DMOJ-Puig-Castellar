package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class numerodeincremento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        List<Integer> num = new ArrayList<>();
        while (true){
            int n = sc.nextInt();
            if (n == 0) break;
            num.add(n);
        }
        int incremento = 0;
        for (int i = 1; i < num.size(); i++){
            if (num.get(i - 1) < num.get(i)){
                incremento++;
            }
        }
        System.out.println(incremento);
    }
}