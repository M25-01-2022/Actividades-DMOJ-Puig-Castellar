package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class c3l113quatreigua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        List<Integer> num = new ArrayList<>();
        while (true){
            int n = sc.nextInt();
            if (n == -1) break;
            num.add(n);
        }
        int numRepetit = 0;
        int repetit = 0;
        int base = num.getFirst();
        for (int i = 0; i < num.size(); i++){
            if (base == num.get(i)){
                repetit++;
            } else if (base != num.get(i)) {
                base = num.get(i);
                repetit = 1;
            }
            if (repetit >= 4){
                numRepetit++;
            }
        }
        System.out.println(numRepetit);
    }
}