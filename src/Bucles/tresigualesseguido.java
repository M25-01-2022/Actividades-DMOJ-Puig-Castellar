package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class tresigualesseguido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n =sc.nextInt();
        for (int i = 0; i < n; i++){
            int contador = 0;
            List<Integer> num = new ArrayList<>();
            while (true){
                int m = sc.nextInt();
                if (m == 0) break;
                num.add(m);
            }
            for (int j = 0; j < num.size(); j++){
                int contadorNum = 0;
                int numBase = num.get(j);
                for (int k = j; k < num.size(); k++){
                    if (numBase == num.get(k)){
                        contadorNum++;
                    }
                }
                if (contadorNum >= 3){
                    contador = contadorNum;
                   break;
                }
            }
            if (contador >= 3){
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}