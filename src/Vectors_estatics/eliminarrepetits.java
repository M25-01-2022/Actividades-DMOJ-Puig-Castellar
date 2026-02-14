package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class eliminarrepetits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        String[] a  = new String[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.next();
        }
        String min = a[0];
        System.out.print(a[0] + " ");
        for(int i = 1; i < n; i++){
            if(min.equals(a[i])){
                System.out.print("");
            } else if(!a[i - 1].equals(a[i])){
                System.out.print(a[i] + " ");
            }
        }
    }
}