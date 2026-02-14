package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class tpv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        String[] plats = new String[n];
        double[] preu = new double[n];
        for (int i = 0; i < n; i++) {
            plats[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            preu[i] = sc.nextDouble();
        }
        int pedidos = sc.nextInt();
        String[] pedido = new String[pedidos];
        double[] cantidad = new double[pedidos];
        for (int i = 0; i < pedidos; i++){
            pedido[i] = sc.next();
            cantidad[i] = sc.nextDouble();
        }
        int limite = 0;
        double precioT = 0.0;
        while (limite < pedidos){
            for (int i = 0; i < n; i++){
                if (pedido[limite].equals(plats[i])){
                    for (int j = 0; j < cantidad[limite]; j++){
                        precioT += preu[i];
                    }
                }
            }
            limite++;
        }
        System.out.print(precioT);
    }
}