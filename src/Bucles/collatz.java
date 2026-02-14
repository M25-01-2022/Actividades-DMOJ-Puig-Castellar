package Bucles;

import java.util.*;
public class collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        List<Integer> num = new ArrayList<>();
        while(n != 1){
            if(n % 2 == 0){
                n = n / 2;
                num.add(n);
            }
            else{
                n = (n * 3) + 1;
                num.add(n);
            }
            if(n == 1){
                break;
            }
        }
        System.out.println(num.size());
    }
}
