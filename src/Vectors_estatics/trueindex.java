package Vectors_estatics;

import java.util.*;
public class trueindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        boolean[] array = new boolean[100];
        int index = sc.nextInt();
        while(index != -1){
            array[index] = true;
            index = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}