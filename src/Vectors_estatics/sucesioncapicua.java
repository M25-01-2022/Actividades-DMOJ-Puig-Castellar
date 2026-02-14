package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class sucesioncapicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        boolean capicua = true;
        int j = n - 1;
        for (int i = 0; i < n / 2; i++){
            if (num[i] != num[j]){
                capicua = false;
                break;
            }
            j--;
        }
        if (capicua) System.out.print("SI");
        else System.out.print("NO");
    }
}