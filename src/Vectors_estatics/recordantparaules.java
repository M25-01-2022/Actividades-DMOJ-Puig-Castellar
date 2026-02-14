package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class recordantparaules {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        String[] guardades = new String[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            String paraula = sc.next();
            boolean repetida = false;
            for (int j = 0; j < total; j++) {
                if (guardades[j].equals(paraula)) {
                    repetida = true;
                    break;
                }
            }

            if (repetida) {
                System.out.println("antiga");
            } else {
                System.out.println("nova");
                guardades[total] = paraula;
                total++;
            }
        }
    }
}