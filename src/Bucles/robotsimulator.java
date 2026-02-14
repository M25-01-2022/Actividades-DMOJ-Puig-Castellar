package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class robotsimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        List<String> move = new ArrayList<>();
        int x = 0;
        int y = 0;
        while (true){
            String m = sc.next();
            if (m.equals(".")) break;
            move.add(m);
        }
        for (String s : move) {
            switch (s) {
                case "N" -> x++;
                case "S" -> x--;
                case "E" -> y++;
                case "W" -> y--;
            }
        }
        System.out.println(y);
        System.out.println(x);
    }
}