package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class progressio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int[] num = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        int iguals = 0;
        for (int i = 1; i < n - 1; i++){
            int r = num[1] - num[0];
            if (num[i + 1] - num[i] != r){
                iguals = 1;
            }
        }

        if (iguals == 0){
            System.out.println("si");
        } else if (iguals == 1) {
            System.out.println("no");
        }
    }
}
