package Operadors;

import java.util.Locale;
import java.util.Scanner;

public class c1l15notamitjana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();

        float f = (n1+n2+n3)/3.0f;
        System.out.println(f);
    }
}
