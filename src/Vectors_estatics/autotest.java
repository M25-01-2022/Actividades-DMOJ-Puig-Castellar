package Vectors_estatics;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class autotest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String[] r = {"a", "b", "a", "c", "a", "b", "b", "c", "b", "c", "a", "c", "b", "a", "a", "a", "c", "c", "b", "a", "c", "b", "c", "c", "a", "a", "c", "a", "a", "c"};
        //Apuntar opciones
        String[] o = new String[30];
        for(int i = 0; i < 30; i++){
            o[i] = sc.next();
        }
        //Cantidad de fallos
        int e = 0;
        List<Integer> fallos = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            if (!o[i].equals(r[i])) {
                e++; fallos.add(i + 1);
            }
        }
        //Suspende o no
        if(e > 3){
            System.out.println("TEST SUSPENDIDO");
        } else if (e <= 3){
            System.out.println("TEST APROBADO");
        }
        System.out.println(e + " fallos.");
        //Pregunta nº X
        for(int i = 1; i <= 30; i++){
            if(i <= 9){
                System.out.print(" " + i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //Respuesta y errores
        for (int i = 0; i < 30; i++) {
            System.out.print(" " + o[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 30; i++) {
            if (!o[i].equals(r[i])) {
                System.out.print(" " + r[i] + " ");
            } else {
                System.out.print("   ");
            }
        }
    }
}