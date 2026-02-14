package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class frameworksmulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++){
            System.out.println("Benvingut a l'enquesta.\n" +
                    "Coneixes algun framework?");
            String op = sc.next();
            switch (op){
                case "no":{
                    System.out.println("---");
                    break;
                }
                case "si":{
                    System.out.print("Quin?\n");
                    String o = sc.next();
                    System.out.println("S'ha registrat la resposta: " + o + "\n---");
                    break;
                }
            }
        }
        System.out.println("Gracies a totes i tots per contestar");
    }
}