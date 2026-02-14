package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class vendallibres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String n = sc.next();
        char[] num = n.toCharArray();
        int quantitat = 0;
        int mayor = Integer.parseInt(String.valueOf(num[0]));
        int posicio = 0;
        for (int i = 0; i < num.length; i++){
            quantitat += Integer.parseInt(String.valueOf(num[i]));
            if (mayor < Integer.parseInt("" + (num[i]))){
                mayor = Integer.parseInt("" + num[i]);
                posicio = i;
            } else if (mayor == Integer.parseInt("" + (num[i]))) {
                mayor = Integer.parseInt("" + num[i]);
                posicio = i;
            }
        }
        System.out.println("La quantitat total de llibres venuts és: " + quantitat);
        System.out.print("El dia amb més ventes ha sigut: ");
        if (posicio == 0) System.out.print("Divendres");
        else if (posicio == 1) System.out.print("Dissabte");
        else if (posicio == 2) System.out.print("Diumenge");
    }
}