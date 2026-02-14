package Program_Orient_Obj;

import java.util.Scanner;

class GearBox {
    int gear;
    int numGears;

    void show(){
        System.out.print("Current gear: ");

        switch (gear){
            case -1:
                System.out.println("R");
                break;
            case 0:
                System.out.println("N");
                break;
            default:
                if (gear > 5){
                    gear = 5;
                } else if (gear < -1) {
                    System.out.println("R");
                    break;
                }
                System.out.println(gear);
        }
    }

    public void gearUp() {
        gear++;
    }

    public void gearDown() {
        gear--;
    }
}

public class c6l23gearbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GearBox gearBox = new GearBox();
        gearBox.numGears = scanner.nextInt();
        scanner.nextLine();

        String action;
        while(!(action = scanner.nextLine()).equals("__END__")){
            switch (action){
                case "UP":
                    gearBox.gearUp();
                    break;
                case "DOWN":
                    gearBox.gearDown();
                    break;
            }
            gearBox.show();
        }
    }
}