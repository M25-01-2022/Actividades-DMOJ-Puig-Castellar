package Bucles;

import java.util.*;
public class calculadoraacumula {
    private static final Scanner sc = new Scanner(System.in);
    public static float res = 0.0f;
    public static int intentos = 0;
    public static void main(String[] args) {
        sc.useLocale(Locale.ENGLISH);
        calculador();
        if (intentos == 0){
            System.out.println(res);
        }
    }
    public static void calculador(){
        while (true){
            String opcio = sc.next();
            if (opcio.equals("END")) break;
            float n = sc.nextFloat();

            if (opcio.equals("+")) {
                res = res + n;
                System.out.println(res);
            } else if (opcio.equals("-")) {
                res = res - n;
                System.out.println(res);
            } else if (opcio.equals("*")) {
                res = res * n;
                System.out.println(res);
            } else if (opcio.equals("/")) {
                res = res / n;
                System.out.println(res);
            }

            intentos++;
        }
    }
}