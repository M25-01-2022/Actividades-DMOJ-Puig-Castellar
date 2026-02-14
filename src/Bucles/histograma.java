package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class histograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, n7 = 0, n8 = 0, n9 = 0;
        for (int i = 0; i < n; i++){
            List<Integer> num = new ArrayList<>();
            while (true){
                int m = sc.nextInt();
                if (m == 0) break;
                num.add(m);
            }
            for (int j = 0; j < num.size(); j++){
                if (num.get(j) == 1) n1++;
                else if (num.get(j) == 2) n2++;
                else if (num.get(j) == 3) n3++;
                else if (num.get(j) == 4) n4++;
                else if (num.get(j) == 5) n5++;
                else if (num.get(j) == 6) n6++;
                else if (num.get(j) == 7) n7++;
                else if (num.get(j) == 8) n8++;
                else if (num.get(j) == 9) n9++;
            }
        }
        String hastag = "#";
        System.out.println("1:" + hastag.repeat(n1));
        System.out.println("2:" + hastag.repeat(n2));
        System.out.println("3:" + hastag.repeat(n3));
        System.out.println("4:" + hastag.repeat(n4));
        System.out.println("5:" + hastag.repeat(n5));
        System.out.println("6:" + hastag.repeat(n6));
        System.out.println("7:" + hastag.repeat(n7));
        System.out.println("8:" + hastag.repeat(n8));
        System.out.println("9:" + hastag.repeat(n9));
    }
}