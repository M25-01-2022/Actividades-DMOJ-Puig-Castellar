package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class c2l41lesquatree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        String nord = "";
        String sud = "";
        if ((mes == 12 && dia >= 21) || (mes <= 3 && (mes < 3 || (mes == 3 && dia < 21)))) {
            nord = "Hivern";
        } else if ((mes == 3 && dia >= 21) || (mes < 6 && mes > 3) || (mes == 6 && dia < 21)) {
            nord = "Primavera";
        } else if ((mes == 6 && dia >= 21) || (mes < 9 && mes > 6) || (mes == 9 && dia < 23)) {
            nord = "Estiu";
        } else if ((mes == 9 && dia >= 23) || (mes < 12 && mes > 9) || (mes == 12 && dia < 21)) {
            nord = "Tardor";
        }
        sud = switch (nord) {
            case "Hivern" -> "Estiu";
            case "Primavera" -> "Tardor";
            case "Estiu" -> "Hivern";
            case "Tardor" -> "Primavera";
            default -> sud;
        };
        System.out.println(nord);
        System.out.println(sud);
    }
}