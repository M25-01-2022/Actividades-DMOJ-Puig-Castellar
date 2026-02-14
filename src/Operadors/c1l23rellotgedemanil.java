package Operadors;

import java.util.Locale;
import java.util.Scanner;
public class c1l23rellotgedemanil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();

        float angleH = (h % 12.0f) * 30.0f + m * 0.5f + s * (0.5f / 60.0f);
        float angleM = m * 6.0f + s * 0.1f;
        float angleS = s * 6.0f;

        System.out.println(angleH);
        System.out.println(angleM);
        System.out.println(angleS);
    }
}
