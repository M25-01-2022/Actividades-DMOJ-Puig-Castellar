package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class impresoramatricial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        List<Integer> num = new ArrayList<>();
        while (true){
            int n = sc.nextInt();
            if (n == -2) break;
            num.add(n);
        }
        String espacio = " ";
        for (int i = 0; i < num.size(); i++){
            if (num.get(i) >= 0){
                System.out.print(espacio.repeat(num.get(i)) + "#");
            } else if (num.get(i) == -1) {
                System.out.println();
            }
        }
    }
}