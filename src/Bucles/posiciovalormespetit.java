package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class posiciovalormespetit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int[] num = new int[n];
        int min = 1;
        int posicio = 1;
        for (int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            if (!(min < num[i])){
                min = num[i];
                posicio = i + 1;
            }
        }
        System.out.print("El nombre més petit és el " + min + " i es troba a la posició " + posicio);
    }
}