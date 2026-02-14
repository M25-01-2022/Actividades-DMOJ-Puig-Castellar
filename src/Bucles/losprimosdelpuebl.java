package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class losprimosdelpuebl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            List<Integer> num = new ArrayList<>();
            while (true){
                int m = sc.nextInt();
                if (m == 0) break;
                num.add(m);
            }
            int contador = 0;
            for (int j = 0; j < num.size(); j++){
                boolean esPrimo = true;
                for (float k = 2; k < num.get(j); k++){
                    if (num.get(j) % k == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    contador++;
                }
            }
            System.out.println(contador);
        }
    }
}