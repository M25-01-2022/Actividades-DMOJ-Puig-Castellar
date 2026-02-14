package Bucles;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
public class obrircandau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        ArrayList<Integer> num = new ArrayList<>();
        while (true){
            int m = sc.nextInt();
            if (m == -1) break;
            num.add(m);
        }
        for (int i = 2; i < num.size(); i++){
            if ((num.get(i - 2) + num.get(i - 1)) * num.get(i) == n){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}