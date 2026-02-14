package Condicionals;

import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;
public class ieee1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String[] prefijos = {"_", "Ki", "Mi", "Gi", "Ti", "Pi", "Ei"};
        BigInteger[] valores = {
                BigInteger.ONE,
                BigInteger.valueOf(1024),
                BigInteger.valueOf(1024).pow(2),
                BigInteger.valueOf(1024).pow(3),
                BigInteger.valueOf(1024).pow(4),
                BigInteger.valueOf(1024).pow(5),
                BigInteger.valueOf(1024).pow(6)
        };
        BigInteger cantidad = sc.nextBigInteger();
        String prefijoEntrada = sc.next();
        String unidadEntrada = sc.next();
        sc.next();
        String prefijoSalida = sc.next();
        String unidadSalida = sc.next();
        BigInteger factorEntrada = BigInteger.ONE;
        for (int i = 0; i < prefijos.length; i++) {
            if (prefijos[i].equals(prefijoEntrada)) {
                factorEntrada = valores[i];
                break;
            }
        }
        BigInteger factorSalida = BigInteger.ONE;
        for (int i = 0; i < prefijos.length; i++) {
            if (prefijos[i].equals(prefijoSalida)) {
                factorSalida = valores[i];
                break;
            }
        }
        BigInteger totalBits = cantidad.multiply(factorEntrada);
        if (unidadEntrada.equals("bytes")) {
            totalBits = totalBits.multiply(BigInteger.valueOf(8));
        }
        BigInteger resultado;
        if (unidadSalida.equals("bits")) {
            resultado = totalBits.divide(factorSalida);
        } else {
            resultado = totalBits.divide(factorSalida.multiply(BigInteger.valueOf(8)));
        }
        String nombreEntrada = (prefijoEntrada.equals("_") ? "" : prefijoEntrada) + unidadEntrada;
        String nombreSalida = (prefijoSalida.equals("_") ? "" : prefijoSalida) + unidadSalida;
        System.out.println(cantidad + " " + nombreEntrada + " = " + resultado + " " + nombreSalida);
    }
}