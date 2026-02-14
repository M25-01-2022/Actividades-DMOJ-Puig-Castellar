package Program_Orient_Obj;

import java.util.Locale;
import java.util.Scanner;

class Equation{
    public float a;
    public float b;
    public float x;
    void calculateSolution(){
        x = -b / a;
    }
}
public class c6l22equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        Equation equation = new Equation();

        while((equation.a = scanner.nextFloat()) != 0) {
            equation.b = scanner.nextFloat();

            equation.calculateSolution();
            System.out.format("%.2f * %.2f + %.2f = 0%n", equation.a, equation.x, equation.b);
        }
    }
}