package Program_Orient_Obj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;


class Car {
    String model;
    int topSpeed;
    float acceleration;
    float braking;
    float cornering;

    public Car(String model, int topSpeed, float acceleration, float braking, float cornering) {
        this.model = model;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.braking = braking;
        this.cornering = cornering;
    }
}
public class b0ae0cotxeclassl0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        int numCars = scanner.nextInt();
        scanner.nextLine();

        Car[] cars = new Car[numCars];

        for (int i = 0; i < numCars; i++) {
            cars[i] = new Car(scanner.nextLine(), scanner.nextInt(), scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());
            scanner.nextLine();
        }

        Arrays.sort(cars, Comparator.comparingInt(a -> -a.topSpeed));
        for (int i = 0; i < numCars; i++) {
            System.out.format("%-20s  %4d  %4.2f  %4.2f  %4.2f %n", cars[i].model, cars[i].topSpeed, cars[i].acceleration, cars[i].braking, cars[i].cornering);
        }
    }
}
