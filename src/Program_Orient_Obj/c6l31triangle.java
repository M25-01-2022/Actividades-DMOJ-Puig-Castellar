package Program_Orient_Obj;

import java.util.Locale;
import java.util.Scanner;
class Triangle {
    float base, height;
    float calculateArea(){
        return base * height / 2;
    }
}
public class c6l31triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.base = scanner.nextFloat();
        t1.height = scanner.nextFloat();

        System.out.format("Area triangle1: %.2f%n", t1.calculateArea());

        t2.base = scanner.nextFloat();
        t2.height = scanner.nextFloat();

        System.out.format("Area triangle2: %.2f%n", t2.calculateArea());
    }
}