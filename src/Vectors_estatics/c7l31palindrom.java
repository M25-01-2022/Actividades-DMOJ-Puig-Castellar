package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class c7l31palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String p = sc.nextLine();
        char[] normal = p.toCharArray();
        char[] revers = new char[p.length()];
        int j = 0;
        for (int i = p.length() - 1; i >= 0;i--){
            revers[j] = normal[i];
            j++;
        }
        boolean capicua = true;
        for (int i = 0; i < p.length() / 2; i++){
            if (revers[i] != normal[i]){
                capicua = false;
                break;
            }
        }
        System.out.print(capicua);
    }
}