package Bucles;

import java.util.*;
public class eslalom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        List<String> p = new ArrayList<>();
        while (true){
            String n = sc.next();
            if (n.equals("META")) break;
            p.add(n);
        }
        for (int i = 0; i < p.size(); i++) {
            System.out.println(p.get(i) + " " + (i + 1));
        }
    }
}