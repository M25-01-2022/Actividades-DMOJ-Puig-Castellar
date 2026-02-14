package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class c2l21permisosuni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int p = sc.nextInt();
        //Extraer cada dígito
        int special = (p / 1000) % 10;
        int u = (p / 100) % 10;
        int g = (p / 10) % 10;
        int o = p % 10;

        StringBuilder sb = new StringBuilder();
        //Usuario
        sb.append((u & 4) != 0 ? 'r' : '-');
        sb.append((u & 2) != 0 ? 'w' : '-');
        if ((u & 1) != 0) {
            sb.append((special & 4) != 0 ? 's' : 'x');
        } else {
            sb.append((special & 4) != 0 ? 'S' : '-');
        }

        //Grupo
        sb.append((g & 4) != 0 ? 'r' : '-');
        sb.append((g & 2) != 0 ? 'w' : '-');
        if ((g & 1) != 0) {
            sb.append((special & 2) != 0 ? 's' : 'x');
        } else {
            sb.append((special & 2) != 0 ? 'S' : '-');
        }

        //Otros
        sb.append((o & 4) != 0 ? 'r' : '-');
        sb.append((o & 2) != 0 ? 'w' : '-');
        if ((o & 1) != 0) {
            sb.append((special & 1) != 0 ? 't' : 'x');
        } else {
            sb.append((special & 1) != 0 ? 'T' : '-');
        }

        System.out.println(sb.toString());
    }
}