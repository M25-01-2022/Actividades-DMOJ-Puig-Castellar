package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class vendesacumulades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) num[i] = sc.nextInt();
        List<String> res = new ArrayList<>();
        int base = num[0];
        res.add(String.valueOf(base));
        for (int i = 1; i < n; i++){
            base += num[i];
            res.add(String.valueOf(base));
        }
        System.out.println(res);
    }
}