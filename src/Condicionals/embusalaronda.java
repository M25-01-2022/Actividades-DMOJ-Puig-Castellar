package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class embusalaronda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int cotxes = sc.nextInt();
        int minuts = sc.nextInt();
        int Cotxesperminuts = cotxes / minuts;
        String res = null;
        if (Cotxesperminuts <= 375) res = "No hi ha embús.";
        else if (Cotxesperminuts > 376 && Cotxesperminuts <= 425) res = "Embús baix.";
        else if (Cotxesperminuts > 425 && Cotxesperminuts <= 575) res = "Embús moderat.";
        else if (Cotxesperminuts > 575 && Cotxesperminuts < 625) res = "Embús alt.";
        else if (Cotxesperminuts >= 625) res = "Embús extrem.";
        System.out.print(res);
    }
}