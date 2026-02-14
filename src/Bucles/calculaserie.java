package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class calculaserie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int suma = 0;
        List<String> out = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            suma += i;
            out.add(String.valueOf(i));
            for (int j = 0; j < i; j++){
                if (i - 1 == j){
                    System.out.println(out.get(j) + " = " + suma);
                } else {
                    System.out.print(out.get(j) + "+");
                }
            }
        }
    }
}