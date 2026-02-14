package Bucles;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
public class sucesiondefibonacc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        ArrayList<Integer> seq = new ArrayList<>();
        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;
            seq.add(num);
        }
        boolean esFibonacci = true;

        if (seq.size() < 2 || seq.get(0) != 0 || seq.get(1) != 1) {
            esFibonacci = false;
        } else {
            for (int i = 2; i < seq.size(); i++) {
                if (seq.get(i) != seq.get(i - 1) + seq.get(i - 2)) {
                    esFibonacci = false;
                    break;
                }
            }
        }
        System.out.println(esFibonacci ? "SI" : "NO");
    }
}