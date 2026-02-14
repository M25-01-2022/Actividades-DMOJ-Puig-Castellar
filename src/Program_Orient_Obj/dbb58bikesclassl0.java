package Program_Orient_Obj;

import java.util.Scanner;

class Bike {
    int speed;

    public Bike(int speed) {
        this.speed = speed;
    }
}

class Race {
    Bike[] bikes;
    public Bike fastest() {
        if (bikes == null || bikes.length == 0) {
            return null;
        }
        Bike fastestBike = bikes[0];
        for (int i = 1; i < bikes.length; i++) {
            if (bikes[i].speed > fastestBike.speed) {
                fastestBike = bikes[i];
            }
        }
        return fastestBike;
    }
}
public class dbb58bikesclassl0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Race race = new Race();

        int numBikes = scanner.nextInt();

        race.bikes = new Bike[numBikes];

        for (int i = 0; i < numBikes; i++) {
            race.bikes[i] = new Bike(scanner.nextInt());
        }

        Bike fastest = race.fastest();

        System.out.println(fastest == null ? "No bikes" : fastest.speed);
    }
}