package Vectors_dinamics;

import java.util.*;
public class larobabruta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        ArrayList<Integer> blanca = new ArrayList<>();
        ArrayList<Integer> negra = new ArrayList<>();
        ArrayList<Integer> color = new ArrayList<>();
        while (true) {
            int id = sc.nextInt();
            if (id == 0) break;

            switch (sc.next()) {
                case "B":
                    blanca.add(id);
                    break;

                case "N":
                    negra.add(id);
                    break;

                case "C":
                    color.add(id);
                    break;
            }
        }
        System.out.println("Cistell de la roba blanca:");
        for (int i = blanca.size() - 1; i >= 0; i--) {
            System.out.println(blanca.get(i));
        }
        System.out.println("Cistell de la roba negra:");
        for (int i = negra.size() - 1; i >= 0; i--) {
            System.out.println(negra.get(i));
        }
        System.out.println("Cistell de la roba de colors:");
        for (int i = color.size() - 1; i >= 0; i--) {
            System.out.println(color.get(i));
        }
    }
}