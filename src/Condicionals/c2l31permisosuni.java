package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class c2l31permisosuni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String[] permisos = new String[9];
        for (int i = 0; i < 9; i++) {
            permisos[i] = sc.next();
        }
        String propietario = sc.next();
        String grupoPropietario = sc.next();

        String usuarioAccede = sc.next();
        String[] gruposUsuario = new String[3];

        for (int i = 0; i < 3; i++) {
            gruposUsuario[i] = sc.next();
        }
        int inicio = 6;
        if (usuarioAccede.equals(propietario)) {
            inicio = 0;
        } else {
            for (int i = 0; i < 3; i++) {
                if (gruposUsuario[i].equals(grupoPropietario)) {
                    inicio = 3;
                    break;
                }
            }
        }

        StringBuilder resultado = new StringBuilder();
        for (int i = inicio; i < inicio + 3; i++) {
            resultado.append(permisos[i].equals("-") ? "-" : permisos[i]);
        }
        System.out.println(resultado);
    }
}