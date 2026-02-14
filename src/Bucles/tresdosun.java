package Bucles;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
public class tresdosun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        ArrayList<Integer> nums = new ArrayList<>();
        while (true) {
            int x = sc.nextInt();
            if (x == -1) break;
            nums.add(x);
        }
        for (int v = 1; v <= 3; v++) {
            int pos = 0;
            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) == v) {
                    pos = i + 1;
                    break;
                }
            }

            int c1 = 0, c2 = 0;
            if (pos != 0) {
                for (int i = pos; i < nums.size(); i++) {
                    int n = nums.get(i);
                    if (n != v) {
                        if (v == 1) {
                            if (n == 2) c1++;
                            else if (n == 3) c2++;
                        } else if (v == 2) {
                            if (n == 1) c1++;
                            else if (n == 3) c2++;
                        } else { // v == 3
                            if (n == 1) c1++;
                            else if (n == 2) c2++;
                        }
                    }
                }
            }
            if (v == 1) {
                System.out.println("1: @ " + pos + " #2 " + c1 + " #3 " + c2);
            } else if (v == 2) {
                System.out.println("2: @ " + pos + " #1 " + c1 + " #3 " + c2);
            } else {
                System.out.println("3: @ " + pos + " #1 " + c1 + " #2 " + c2);
            }
        }
    }
}