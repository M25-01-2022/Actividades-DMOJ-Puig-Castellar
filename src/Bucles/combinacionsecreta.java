package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class combinacionsecreta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        List<Integer> num = new ArrayList<>();
        while (true){
            int m = sc.nextInt();
            if (m == -1) break;
            num.add(m);
        }
        boolean seguido = false;
        for (int i = 2; i < num.size(); i++){
            if (num.get(i - 2) == n1 && num.get(i - 1) == n2 && num.get(i) == n3){
                seguido = true;
            }
        }
        if (seguido){
            System.out.println("ABIERTA");
        } else {
            System.out.println("CERRADA");
        }
    }
}