package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class c3l11jumpjump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        List<Integer> num = new ArrayList<>();
        while (true){
            int n = sc.nextInt();
            if (n == -1) break;
            num.add(n);
        }
        int salts = 0;
        int base = num.getFirst();
        for (int i = 0; i < num.size(); i++){
            if (base < num.get(i)){
                salts++;
                base = num.get(i);
            } else {
                base = num.get(i);
            }
        }
        System.out.println(salts);
    }
}