package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class divisiblespor7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        List<Integer> num = new ArrayList<>();
        while (true){
            int n = sc.nextInt();
            if (n == 0) break;
            num.add(n);
        }
        for (int i = 0; i < num.size(); i++){
            boolean res = (num.get(i) % 7 == 0);
            if (res){
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}