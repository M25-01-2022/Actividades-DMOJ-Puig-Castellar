package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class c4l12apunts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        String[] array = new String[n];
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            String text = sc.nextLine();
            array[num - 1] = text;
        }
        for(int i = 0; i < n; i++){
            System.out.println((i + 1) + array[i]);
        }
    }
}