package Program_Orient_Obj;

class Stat {
    int value;
    int max;
    Stat(int max) {
        this.max = max;
        this.value = max;
    }
}
class Enemy {
    String type;
    Stat health;
    Stat weapon;
    Enemy(String type) {
        this.type = type;
        switch (type) {
            case "guerrero":
                health = new Stat(50);
                weapon = new Stat(60);
                break;
            case "amazona":
                health = new Stat(40);
                weapon = new Stat(70);
                break;
            case "brujo":
                health = new Stat(30);
                weapon = new Stat(80);
                break;
        }
    }
}

public class e679denemyclassl0 {
    public static void main(String[] args) {
        Enemy guerrero = new Enemy("guerrero");
        Enemy amazona = new Enemy("amazona");
        Enemy brujo = new Enemy("brujo");

        System.out.println("GUERRERO  " +
                "Health: " + guerrero.health.value + "/" + guerrero.health.max + "   " +
                "Weapon: " + guerrero.weapon.value + "/" + guerrero.weapon.max);

        System.out.println("AMAZONA   " +
                "Health: " + amazona.health.value + "/" + amazona.health.max + "   " +
                "Weapon: " + amazona.weapon.value + "/" + amazona.weapon.max);

        System.out.println("BRUJO     " +
                "Health: " + brujo.health.value + "/" + brujo.health.max + "   " +
                "Weapon: " + brujo.weapon.value + "/" + brujo.weapon.max);
    }
}