package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class rotaelvectorenel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        String[] num = new String[n];
        for (int i = 0; i < n; i++){
            num[i] = sc.next();
        }
        int rotar = sc.nextInt();
        for (int i = rotar; i < n; i++){
            System.out.print(num[i] + " ");
        }
        for (int i = 0; i < rotar; i++){
            System.out.print(num[i] + " ");
        }
    }
}