package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class cuentasdenumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0){
            System.out.print(0);
        } else {
            for (int i = 0; i < n; i++){
                List<Integer> nums = new ArrayList<>();
                while (true){
                    int m = sc.nextInt();
                    if (m == 0) break;
                    nums.add(m);
                }
                System.out.println(nums.size());
            }
        }
    }
}