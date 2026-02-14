package Program_Orient_Obj;

import java.util.Locale;
import java.util.Scanner;

class Equation2D {

    float a, b, c;

    public float[] solve(){
        float[] roots = new float[2];
        float discriminant = b * b - 4 * a * c;
        if (discriminant >= 0) {
            float sqrt = (float) Math.sqrt(discriminant);
            roots[0] = (-b + sqrt) / (2 * a);
            roots[1] = (-b - sqrt) / (2 * a);
        } else {
            roots[0] = Float.NaN;
            roots[1] = Float.NaN;
        }
        return roots;
    }
}

public class c6l32equation2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        Equation2D equation2D = new Equation2D();

        equation2D.a = scanner.nextFloat();
        equation2D.b = scanner.nextFloat();
        equation2D.c = scanner.nextFloat();

        float[] x = equation2D.solve();

        System.out.format("%1$.2f * %4$.2f * %4$.2f  + %2$.2f * %4$.2f + %3$.2f = 0%n",
                equation2D.a, equation2D.b, equation2D.c, x[0]);
        System.out.format("%1$.2f * %4$.2f * %4$.2f  + %2$.2f * %4$.2f + %3$.2f = 0%n",
                equation2D.a, equation2D.b, equation2D.c, x[1]);
    }
}