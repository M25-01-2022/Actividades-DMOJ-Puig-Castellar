package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class contenidors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String estado = sc.next();
        String comando = sc.next();
        String resultado = null;
        if (estado.equals("_") && comando.equals("CREATE")) {
            resultado = "CREATED";
        }
        else if (estado.equals("CREATED") && comando.equals("START")) {
            resultado = "RUNNING";
        }
        else if (estado.equals("CREATED") && comando.equals("RM")) {
            resultado = "DELETED";
        }
        else if (estado.equals("RUNNING") && comando.equals("PAUSE")) {
            resultado = "PAUSED";
        }
        else if (estado.equals("RUNNING") && comando.equals("STOP")) {
            resultado = "STOPPED";
        }
        else if (estado.equals("PAUSED") && comando.equals("UNPAUSE")) {
            resultado = "RUNNING";
        }
        else if (estado.equals("STOPPED") && comando.equals("START")) {
            resultado = "RUNNING";
        }
        else if (estado.equals("STOPPED") && comando.equals("RM")) {
            resultado = "DELETED";
        }
        if (resultado != null) {
            System.out.println(resultado);
        } else {
            System.out.println("Invalid command " + comando + " for state " + estado);
        }
    }
}