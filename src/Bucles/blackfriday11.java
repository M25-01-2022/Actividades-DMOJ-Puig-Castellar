package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class blackfriday11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        while (true) {
            int N = sc.nextInt();
            float P = sc.nextFloat();
            if (N == 0 && P == 0.0f) break;

            String[][] productos = new String[N][2];
            for (int i = 0; i < N; i++) {
                String codigo = sc.next();
                float precio = sc.nextFloat();
                productos[i][0] = codigo;
                productos[i][1] = String.valueOf(precio);
            }

            for (int i = 0; i < N; i++) {
                String codigo = productos[i][0];
                float precio = Float.parseFloat(productos[i][1]);
                float nuevo_precio = precio + (precio * P) / 100;
                System.out.println(codigo + " " + nuevo_precio);
            }
        }

    }
}
