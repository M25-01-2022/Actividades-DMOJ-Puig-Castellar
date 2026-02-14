package Vectors_estatics;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class metrocircular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        String[] paradas = new String[n];
        for (int i = 0; i < n; i++) {
            paradas[i] = sc.next();
        }
        int[] tiempos = new int[n];
        for (int i = 0; i < n; i++) {
            tiempos[i] = sc.nextInt();
        }
        String a = sc.next();
        String b = sc.next();
        int idxOrigen = 0, idxDestino = 0;
        for (int i = 0; i < n; i++) {
            if (paradas[i].equals(a)) idxOrigen = i;
            if (paradas[i].equals(b)) idxDestino = i;
        }
        int tiempoH = 0;
        int i = idxOrigen;
        List<String> rutaH = new ArrayList<>();
        rutaH.add(paradas[i]);
        while (i != idxDestino) {
            tiempoH += tiempos[i];
            i = (i + 1) % n;
            rutaH.add(paradas[i]);
        }
        int tiempoAntiH = 0;
        i = idxOrigen;
        List<String> rutaAntiH = new ArrayList<>();
        rutaAntiH.add(paradas[i]);
        while (i != idxDestino) {
            i = (i - 1 + n) % n;
            tiempoAntiH += tiempos[i];
            rutaAntiH.add(paradas[i]);
        }
        if (tiempoH <= tiempoAntiH) {
            for (String e : rutaH) System.out.println(e);
            System.out.println(tiempoH);
        } else {
            for (String e : rutaAntiH) System.out.println(e);
            System.out.println(tiempoAntiH);
        }
    }
}