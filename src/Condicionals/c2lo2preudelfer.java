package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class c2lo2preudelfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float k = sc.nextFloat();
        int d = sc.nextInt();

        if(d > 7 && k > 800.0f){
            float p = (k * 0.35f)*(100.0f-30.0f)/100.0f;
            System.out.println(p);
        } else {
            float p = k * 0.35f;
            System.out.println(p);
        }
    }
}