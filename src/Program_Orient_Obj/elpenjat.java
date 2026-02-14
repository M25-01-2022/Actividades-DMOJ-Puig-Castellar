package Program_Orient_Obj;

import java.util.Locale;
import java.util.Scanner;

class Ahorcado{
    public int fallos;
    public boolean completado;
    public String palabra;
    public char[] descubierta;

    public Ahorcado(String palabra) {
        this.fallos = 0;
        this.completado = false;
        this.palabra = palabra;
        this.descubierta = palabra.toCharArray();

        for (int i = 0; i < palabra.length(); i++){
            this.descubierta[i] = '_';
        }
    }
}
public class elpenjat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);


        Ahorcado ahorcado = new Ahorcado(scanner.next());

        while(ahorcado.fallos < 6 && !ahorcado.completado){
            for (int i = 0; i < ahorcado.descubierta.length; i++) {
                System.out.print(" " + ahorcado.descubierta[i] + " ");
            }
            System.out.println();

            char letra = scanner.next().charAt(0);

            ahorcado.completado = true;
            boolean estaLaLetra = false;
            for (int i = 0; i < ahorcado.palabra.length(); i++) {
                if(ahorcado.palabra.charAt(i) == letra){
                    ahorcado.descubierta[i] = letra;
                    estaLaLetra = true;
                }
                if(ahorcado.descubierta[i] == '_'){
                    ahorcado.completado = false;
                }
            }
            if(!estaLaLetra){
                ahorcado.fallos++;
            }

            if(ahorcado.fallos == 5)      System.out.println("\n  __    \n |  |   \n |  0   \n | /|\\ \n | /    \n |____    \n");
            else if(ahorcado.fallos == 4) System.out.println("\n  __    \n |  |   \n |  0   \n | /|\\ \n |      \n |____    \n");
            else if(ahorcado.fallos == 3) System.out.println("\n  __    \n |  |   \n |  0   \n | /|   \n |      \n |____    \n");
            else if(ahorcado.fallos == 2) System.out.println("\n  __    \n |  |   \n |  0   \n | /    \n |      \n |____    \n");
            else if(ahorcado.fallos == 1) System.out.println("\n  __    \n |  |   \n |  0   \n |      \n |      \n |____    \n");
            else if(ahorcado.fallos == 0) System.out.println("\n  __    \n |  |   \n |      \n |      \n |      \n |____    \n");
        }

        if(ahorcado.fallos == 6) System.out.println("\n  __    \n |  |   \n |  0   \n | /|\\ \n | / \\ \n |____    \n");
        else System.out.println("YOU WIN");
    }
}