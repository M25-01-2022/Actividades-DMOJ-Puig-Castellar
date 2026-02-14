package Condicionals;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class undostres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        List<Integer> num = new ArrayList<>();

        for (int i = 0; i < 3; i++){
            int n = sc.nextInt();
            num.add(n);
        }
        int first = num.getFirst();
        int second = num.get(1);
        int third = num.get(2);

        int iguals = 0;
        boolean secuencial = false;
        for (int i = 0; i < num.size(); i++) {
            for (int j = i + 1; j < num.size(); j++){
                if (num.get(i).equals(num.get(j))){
                    iguals++;
                }
            }
        }

        int min = Math.min(first, Math.min(second, third));
        int max = Math.max(first, Math.max(second, third));

        if (first != second && second != third && first != third && max - min == 2) {
            secuencial = true;
        }

        if (iguals == 3){
            System.out.print("THREE OF A KIND");
        } else if (secuencial){
            System.out.print("STRAIGHT");
        } else if (iguals >= 1){
            System.out.print("PAIR");
        } else {
            System.out.print("HIGH CARD");
        }
    }
}