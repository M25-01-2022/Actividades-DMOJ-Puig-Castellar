package Vectors_dinamics;

import java.util.*;
public class arraylistinsertv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        List<Integer> num = new ArrayList<>();
        while (true){
            int n = sc.nextInt();
            if (n < 0) break;
            int pos = sc.nextInt();
            if (num.size() < pos){
                pos = num.size();
                num.add(pos, n);
            } else if (pos < 0) {
                pos = 0;
                num.add(pos,n);
            } else {
                num.add(n);
            }
        }
        for (Integer i : num) {
            System.out.print(i + " ");
        }
    }
}