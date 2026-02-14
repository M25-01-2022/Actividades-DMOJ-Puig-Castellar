package Vectors_estatics;

import java.util.Locale;
import java.util.Scanner;
public class lasaltarina {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int e = sc.nextInt();
        int E = e;

        int[] cami = new int[n];

        for (int i = 0; i < n; i++){
            cami[i] = sc.nextInt();
        }

        boolean tresor = false;
        boolean salt = false;
        boolean energia = false;
        int passos = 1;

        for (int i = n - 1; i >=0; i--){
            if (cami[i] == -1){
                tresor = true;
                break;
            } else if (cami[i] >= 4){
                salt = true;
                break;
            } else if (cami[i] * 2 >= e){
                energia = true;
                break;
            } else {
                e -= cami[i] * 2;
                passos++;
            }
        }

        if (tresor){
            System.out.println("Pel cantó dret, s'arriba al tresor en " + passos + " passos consumint " + (E - e) + " unitats d'energia.");
        } else if (salt) {
            System.out.println("Pel cantó dret, no es pot arribar al tresor perquè hi ha un forat massa gran.");
        } else if (energia) {
            System.out.println("Pel cantó dret, no es pot arribar al tresor perquè s'acaba l'energia.");
        }

        tresor = false;
        salt = false;
        energia = false;
        passos = 1;
        e = E;
        for (int i = 0; i < n; i++){
            if (cami[i] == -1){
                tresor = true;
                break;
            } else if (cami[i] >= 4){
                salt = true;
                break;
            } else if (cami[i] * 2 >= e){
                energia = true;
                break;
            } else {
                e -= cami[i] * 2;
                passos++;
            }
        }

        if (tresor){
            System.out.println("Pel cantó esquerra, s'arriba al tresor en " + passos + " passos consumint " + (E - e) + " unitats d'energia.");
        } else if (salt) {
            System.out.println("Pel cantó esquerra, no es pot arribar al tresor perquè hi ha un forat massa gran.");
        } else if (energia) {
            System.out.println("Pel cantó esquerra, no es pot arribar al tresor perquè s'acaba l'energia.");
        }
    }
}
