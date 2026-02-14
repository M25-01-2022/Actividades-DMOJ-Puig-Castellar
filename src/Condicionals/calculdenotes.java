package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class calculdenotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float n = sc.nextFloat();

        if(n < 5){
            System.out.print("INSUFICIENT");
        } else if (n < 6) {
            System.out.print("SUFICIENT");
        } else if (n < 7) {
            System.out.print("BE");
        } else if (n < 8.5f) {
            System.out.print("NOTABLE");
        } else if (n < 10) {
            System.out.print("EXCEL.LENT");
        } else if (n == 10) {
            System.out.print("MATRICULA");
        }
    }
}