package Vectors_estatics;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class passarllista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        sc.nextLine();
        String[] llista = new String[n];
        for (int i = 0; i < n; i++){
            llista[i] = sc.next();
        }
        List<String> alums = new ArrayList<>();
        while (true){
            String a = sc.next();
            if (a.equals("__FI__")) break;
            alums.add(a);
        }
        for (String alum : alums) {
            boolean trobat = false;
            int posicio = 0;
            for (int j = 0; j < n; j++) {
                if (alum.equals(llista[j])) {
                    trobat = true;
                    posicio = j;
                    break;
                }
            }
            if (trobat) {
                System.out.println(posicio + 1);
            } else {
                System.out.println("NO");
            }
        }
    }
}