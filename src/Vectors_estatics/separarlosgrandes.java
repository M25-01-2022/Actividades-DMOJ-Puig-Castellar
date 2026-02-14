package Vectors_estatics;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class separarlosgrandes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        int limite = sc.nextInt();
        List<Integer> inf = new ArrayList<>();
        List<Integer> sup = new ArrayList<>();
        for (int i = 0; i < n; i++){
            if (num[i] <= limite) inf.add(num[i]);
            else sup.add(num[i]);
        }
        for (int i : inf) System.out.print(i + " ");
        System.out.println();
        for (int i : sup) System.out.print(i + " ");
    }
}