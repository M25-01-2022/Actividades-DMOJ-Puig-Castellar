package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class estadisticasdelpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int prevLocal = -1;
        int prevVisit = -1;
        boolean first = true;
        while (true) {
            int local = sc.nextInt();
            int visit = sc.nextInt();
            if (local == -1 && visit == -1) {
                if (!first) {
                    if (prevLocal > prevVisit) {
                        System.out.println("FINAL DEL PARTIDO, GANA LOCAL: " + prevLocal + " " + prevVisit);
                    } else if (prevVisit > prevLocal) {
                        System.out.println("FINAL DEL PARTIDO, GANA VISITANTE: " + prevLocal + " " + prevVisit);
                    } else {
                        System.out.println("FINAL DEL PARTIDO, EMPATE: " + prevLocal + " " + prevVisit);
                    }
                }
                break;
            }
            if (first) {
                System.out.println("EMPIEZA EL PARTIDO, EMPATE: " + local + " " + visit);
                first = false;
            } else {
                if (local > prevLocal) {
                    if (local > visit) {
                        System.out.println("GOL LOCAL, GANA LOCAL: " + local + " " + visit);
                    } else if (visit > local){
                        System.out.println("GOL LOCAL, GANA VISITANTE: " + local + " " + visit);
                    } else {
                        System.out.println("GOL LOCAL, EMPATE: " + local + " " + visit);
                    }
                } else {
                    if (visit > local) {
                        System.out.println("GOL VISITANTE, GANA VISITANTE: " + local + " " + visit);
                    } else if (local > visit){
                        System.out.println("GOL VISITANTE, GANA LOCAL: " + local + " " + visit);
                    } else {
                        System.out.println("GOL VISITANTE, EMPATE: " + local + " " + visit);
                    }
                }
            }
            prevLocal = local;
            prevVisit = visit;
        }
    }
}