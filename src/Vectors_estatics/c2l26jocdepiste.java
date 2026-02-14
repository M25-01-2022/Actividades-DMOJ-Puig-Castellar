package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class c2l26jocdepiste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int posicio = sc.nextInt();
        String caracter = sc.next();
        sc.nextLine();
        String[] pistas = new String[n];
        for (int i = 0; i < n; i++) {
            pistas[i] = sc.nextLine();
        }
        while (true) {
            String actual = pistas[posicio];
            System.out.println(actual);
            if (actual.equals("PREMI")) {
                break;
            }
            int idx = actual.indexOf(caracter);
            int i = idx + caracter.length();
            StringBuilder num = new StringBuilder();
            while (i < actual.length() && !Character.isDigit(actual.charAt(i))) {
                i++;
            }
            while (i < actual.length() && Character.isDigit(actual.charAt(i))) {
                num.append(actual.charAt(i));
                i++;
            }
            posicio = Integer.parseInt(num.toString());
        }
    }
}