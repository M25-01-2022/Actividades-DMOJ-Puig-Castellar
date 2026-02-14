package Vectors_estatics;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class separarlletresinums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        char[] caracter = new char[n];
        for (int i = 0; i < n; i++){
            caracter[i] = sc.next().charAt(0);
        }
        List<Integer> num = new ArrayList<>();
        List<String> pal = new ArrayList<>();
        for (int i = 0; i < n; i++){
            if (Character.isDigit(caracter[i])) num.add(Integer.parseInt(String.valueOf(caracter[i])));
            else if (Character.isLetter(caracter[i])) pal.add(String.valueOf(caracter[i]));
        }
        for (int m : num) System.out.print(m + " ");
        System.out.println();
        for (String m : pal) System.out.print(m + " ");
    }
}