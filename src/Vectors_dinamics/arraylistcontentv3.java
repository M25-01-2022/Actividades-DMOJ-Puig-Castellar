package Vectors_dinamics;

import java.util.*;
public class arraylistcontentv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        List<Integer> num = new ArrayList<>();
        while (true){
            int n = sc.nextInt();
            if (n < 0) break;
            num.add(n);
        }
        int centro = num.size() / 2;
        int valor = num.get(centro);
        if (valor >= 0 && valor < num.size()) {
            System.out.println(num.get(valor));
        } else {
            System.out.println(-1);
        }
    }
}