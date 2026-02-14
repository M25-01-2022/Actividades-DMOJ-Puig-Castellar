package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class c3l05comptavocal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        String[] pal = new String[n];
        for (int i = 0; i < n; i++){
            pal[i] = sc.next();
        }
        for (int i = 0; i < n; i++){
            if (pal[i].equals("a")) System.out.println(pal[i]);
            else if (pal[i].equals("e")) System.out.println(pal[i]);
            else if (pal[i].equals("i")) System.out.println(pal[i]);
            else if (pal[i].equals("o")) System.out.println(pal[i]);
            else if (pal[i].equals("u")) System.out.println(pal[i]);
        }
    }
}