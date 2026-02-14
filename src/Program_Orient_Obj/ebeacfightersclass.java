package Program_Orient_Obj;

import java.util.Scanner;


class Fighter {
    String name;
    float strength;
    float speed;
    float agility;

    Fighter(String name, float strength, float speed, float agility) {
        this.name = name;
        this.strength = strength;
        this.speed = speed;
        this.agility = agility;
    }

    float getSum(){
        return strength + speed + agility;
    }
}

class Fight {
    public Fighter winner(Fighter f1, Fighter f2) {
        float sum1 = f1.getSum();
        float sum2 = f2.getSum();

        if (sum1 > sum2) {
            return f1;
        } else if (sum2 > sum1) {
            return f2;
        } else {
            return null;
        }
    }
}
public class ebeacfightersclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Fighter f1 = new Fighter(scanner.next(), scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());
        Fighter f2 = new Fighter(scanner.next(), scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());

        Fighter winner = new Fight().winner(f1, f2);

        System.out.println(winner == null ? "DOUBLE KO" : winner.name);
    }
}