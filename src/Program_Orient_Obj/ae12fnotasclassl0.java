package Program_Orient_Obj;

import java.util.Locale;
import java.util.Scanner;


class Alumno{
    float[] notas;
}

public class ae12fnotasclassl0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        Alumno alumno = new Alumno();

        int numeroNotas = scanner.nextInt();

        alumno.notas = new float[numeroNotas];

        for(int i=0; i<numeroNotas; i++){
            alumno.notas[i] = scanner.nextFloat();
        }

        float suma = 0;
        for(int i=0; i<numeroNotas; i++){
            suma += alumno.notas[i];
        }

        System.out.println("Nota media: " + suma/numeroNotas);
    }
}