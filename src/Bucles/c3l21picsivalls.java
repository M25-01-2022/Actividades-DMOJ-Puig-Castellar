package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class c3l21picsivalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        List<Integer> num = new ArrayList<>();
        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;
            num.add(n);
        }
        if (num.isEmpty()) {
            System.out.println(0);
            System.out.println(0);
            return;
        }
        int npics = 0;
        int nvalls = 0;
        int min = num.getFirst();
        int max = num.getFirst();
        for (int i = 1; i < num.size(); i++) {
            if (num.get(i) < min) min = num.get(i);
            if (num.get(i) > max) max = num.get(i);
        }
        for (int i = 1; i < num.size() - 1; i++) {
            int anterior = num.get(i - 1);
            int actual = num.get(i);
            int siguiente = num.get(i + 1);
            if (anterior < actual && siguiente <= actual) {
                npics++;
            }
            else if (anterior > actual && siguiente >= actual) {
                nvalls++;
            }
        }
        System.out.println(npics);
        System.out.println(nvalls);
        System.out.println(max);
        System.out.println(min);
    }
}