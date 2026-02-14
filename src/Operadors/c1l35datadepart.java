package Operadors;

import java.util.Locale;
import java.util.Scanner;

public class c1l35datadepart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int dc = sc.nextInt();
        int mc = sc.nextInt();
        int ac = sc.nextInt();
        int da = sc.nextInt();
        int ma = sc.nextInt();
        int aa = sc.nextInt();

        if (ac < aa || (ac == aa && mc < ma) || (ac == aa && mc == ma && dc < da)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
