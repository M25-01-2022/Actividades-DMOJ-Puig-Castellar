package Program_Orient_Obj;

import java.util.Locale;
import java.util.Scanner;

class Thermometer{
    public float celsius;
    void printCelsius(){
        System.out.printf(Locale.ENGLISH,"%7.2fC%n", celsius);
    }
    void printFahrenheit(){
        System.out.printf(Locale.ENGLISH,"%7.2fF%n", (celsius * 9/5) + 32);
    }
    void printKelvin(){
        System.out.printf(Locale.ENGLISH,"%7.2fK%n", celsius + 273.15f);
    }
}
public class c6l21termometre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        Thermometer thermometer1 = new Thermometer();
        Thermometer thermometer2 = new Thermometer();

        float a, b;
        while((a = scanner.nextFloat()) >= -273.1f) {
            thermometer1.celsius = a;
            thermometer2.celsius = scanner.nextFloat();

            System.out.println("Termometre 1");
            thermometer1.printCelsius();
            thermometer1.printFahrenheit();
            thermometer1.printKelvin();

            System.out.println("Termometre 2");
            thermometer2.printCelsius();
            thermometer2.printFahrenheit();
            thermometer2.printKelvin();

            System.out.println("--------");
        }
    }
}