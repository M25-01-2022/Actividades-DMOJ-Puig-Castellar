package Vectors_estatics;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class fireball1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        int[] vida = new int[n];
        for (int i = 0; i < n; i++){
            vida[i] = sc.nextInt();
        }
        List<Integer> posicion = new ArrayList<>();
        List<Integer> anchura = new ArrayList<>();
        List<Integer> dany = new ArrayList<>();
        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a == -1 && b == -1 && c == -1) break;
            posicion.add(a);
            anchura.add(b);
            dany.add(c);
        }
        for (int i = 0; i < posicion.size(); i++) {
            int pos = posicion.get(i);
            int abast = anchura.get(i);
            int dan = dany.get(i);

            int inicio = Math.max(0, pos - abast);
            int fin = Math.min(n - 1, pos + abast);
            for (int j = inicio; j <= fin; j++) {
                vida[j] = Math.max(0, vida[j] - dan);
            }
            for (int j = 0; j < n; j++) {
                System.out.print(vida[j] + " ");
            }
            System.out.println();
        }
    }
}