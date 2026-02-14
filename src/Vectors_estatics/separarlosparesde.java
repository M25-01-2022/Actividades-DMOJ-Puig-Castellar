package Vectors_estatics;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class separarlosparesde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        List<Integer> senar = new ArrayList<>();
        List<Integer> parell = new ArrayList<>();
        List<Integer> posicioS = new ArrayList<>();
        List<Integer> posicioP = new ArrayList<>();
        for (int i = 0; i < n; i++){
            if (i % 2 == 0) posicioP.add(num[i]);
            else posicioS.add(num[i]);
            if (num[i] % 2 == 0) parell.add(num[i]);
            else senar.add(num[i]);
        }
        for (int i : posicioP) System.out.print(i + " ");
        System.out.println();
        for (int i : posicioS) System.out.print(i + " ");
        System.out.println();
        for (int i : parell) System.out.print(i + " ");
        System.out.println();
        for (int i : senar) System.out.print(i + " ");
    }
}