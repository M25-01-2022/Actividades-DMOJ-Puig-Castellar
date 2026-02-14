package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class maquinaparada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int Dapagat = 0;
        int Tapagat = 0;
        for(int i = 0; i < n; i++){
            int m = sc.nextInt();
            int o = sc.nextInt();
            if (m != o){
                Dapagat++;
                Tapagat += (m - o);
            }
        }
        System.out.print(Dapagat + "\n" + Tapagat);
    }
}