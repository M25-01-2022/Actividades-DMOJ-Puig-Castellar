package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class sumadigitos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        List<Integer> num = new ArrayList<>();
        while (true){
            int n =  sc.nextInt();
            if (n == 0) break;
            num.add(n);
        }
        int base = 0;
        for (int i = 0; i < num.size(); i++){
            char[] nums =  num.get(i).toString().toCharArray();
            for (int j = 0; j < nums.length; j++){
                int m = Integer.parseInt(String.valueOf(nums[j]));
                base += m;
            }
            System.out.println(base);
            base = 0;
        }
    }
}