package Operadors;

import java.util.Locale;
import java.util.Scanner;
public class paraulesiguals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String n = sc.nextLine();
        String m = sc.nextLine();

        System.out.println(n.equals(m));
    }
}