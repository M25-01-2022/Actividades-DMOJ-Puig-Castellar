package Vectors_estatics;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class amagalescolu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int f = sc.nextInt();
        int c = sc.nextInt();

        String[][] tabla = new String[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                tabla[i][j] = sc.next();
            }
        }
        int n = sc.nextInt();
        Set<Integer> o = new HashSet<>();
        for (int i = 0; i < n; i++) {
            o.add(sc.nextInt() - 1);
        }
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (!o.contains(j)) {
                    System.out.printf("%-10s", tabla[i][j]);
                }
            }
            System.out.println();
        }
    }
}