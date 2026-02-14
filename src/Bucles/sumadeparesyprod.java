package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class sumadeparesyprod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = 0;
        int sumP = 0;
        int multiS = -1;
        int total = -1;
        while (n != -1){
            n = sc.nextInt();
            if(n % 2 == 0){
                sumP += n;
            } else if (n % 2 != 0) {
                multiS *= n;
            }
            total++;
        }
        System.out.println(sumP);
        System.out.println(multiS);
        System.out.println(total);
    }
}