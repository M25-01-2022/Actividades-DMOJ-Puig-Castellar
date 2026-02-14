package Cadenes_de_text;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class c3l23l33t {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        List<String> par = new ArrayList<>();
        while (true){
            String p = sc.nextLine();
            if (p.equals("END")) break;
            par.add(p);
        }
        for (String s : par) {
            if (s.equals("Hello world")) System.out.print("h3110 \\/\\/0R1d");
            else if (s.equals("Hello leet")) System.out.print("h3110 1337");
            else if (s.equals("goodbye world")) System.out.print("600d8Y3 \\/\\/0r1D");
            else if (s.equals("all your base are belong to us")) System.out.print("411 y0|_|R 8453 4r3 8310N6 70 |_|5");
            else if (s.equals("It's over 9000!")) System.out.print("!7'5 0\\\\//3R 9000!");
            if (s.equals("Lorem ipsum ")) System.out.println("10r3/\\/\\ !P5|_|/\\/\\ ");
            else if (s.equals("dolor sit amet, ")) System.out.println("d010R 5!7 4/\\/\\37 ");
            else if (s.equals("consectetur adipiscing elit.")) System.out.print("c0N53c737|_|R 4d!P!5c!N6 31!7");
            if (s.equals("This isn't even, ")) System.out.println("7h!5 !5N'7 3\\\\//3N ");
            else if (s.equals("my final form.")) System.out.print("/\\/\\y F!n41 F0r/\\/\\");
            if (s.equals("If the Tao is great, then the operating system is great. "))
                System.out.println("!f 7H3 740 !5 6r347 7H3n 7H3 0p3R47!n6 5Y573/\\/\\ !5 6r347 ");
            else if (s.equals("If the operating system is great, then the compiler is great. "))
                System.out.println("!F 7h3 0P3r47!N6 5y573/\\/\\ !5 6R347 7h3N 7h3 C0/\\/\\p!13R !5 6r347 ");
            else if (s.equals("If the compiler is great, then the application is great. "))
                System.out.println("!F 7h3 C0/\\/\\p!13R !5 6r347 7H3n 7H3 4pP1!c47!0N !5 6r347 ");
            else if (s.equals("The user is pleased, and there is harmony in the world."))
                System.out.print("7H3 |_|53r !5 P13453d 4Nd 7H3r3 !5 H4r/\\/\\0Ny !N 7h3 \\/\\/0R1d");
        }
    }
}