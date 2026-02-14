package Bucles;

import java.util.*;
public class e9bedgeneradordec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        ArrayList<Integer> num = new ArrayList<>();
        while (true){
            int n = sc.nextInt();
            if (n == 0)break;
            num.add(n);
        }
        for (int i = 0; i < num.size(); i++){
            if (num.getFirst() == 1){
                System.out.println("CORRECTE");
                return;
            }
        }
        System.out.println("INCORRECTE");
    }
}
