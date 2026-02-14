package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class cuentapalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        List<String> num = new ArrayList<>();
        while (true){
            String n = sc.next();
            if (n.equals("END")) break;
            num.add(n);
        }
        System.out.print(num.size());
    }
}