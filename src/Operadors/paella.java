package Operadors;

import java.util.Locale;
import java.util.Scanner;

public class paella {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float c = sc.nextFloat();
        float a = sc.nextFloat();
        float g = sc.nextFloat();

        float Ka = (c/ 4.0f) * 0.5f;
        float Kg = (c / 4.0f) * 0.25f;
        float Ea = Ka * a;
        float Eg = Kg * g;
        float total = Ea + Eg;


        System.out.println(Ka + " kg arros");
        System.out.println(Kg + " kg gambes");
        System.out.println(Ea + " euros arros");
        System.out.println(Eg + " euros gambes");
        System.out.println("TOTAL: "+ total + " euros");
    }
}
