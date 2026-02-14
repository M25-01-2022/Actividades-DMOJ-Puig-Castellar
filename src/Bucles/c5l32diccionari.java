package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class c5l32diccionari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        List<String> palabra = new ArrayList<>();
        while (true){
            String p = sc.next();
            if (p.equals("__END__")) break;
            palabra.add(p);
        }
        System.out.println("class Dictionari {\n" +
                "    String[] words = {");
        for (int i = 0; i < palabra.size(); i++){
            if (palabra.size() - 1 == i){
                System.out.println("        \"" + palabra.get(i) + "\"");
            } else {
                System.out.println("        \"" + palabra.get(i) + "\",");
            }
        }
        System.out.println("    };\n" +
                "}");
    }
}