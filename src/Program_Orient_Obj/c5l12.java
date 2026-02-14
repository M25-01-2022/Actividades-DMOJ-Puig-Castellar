package Program_Orient_Obj;

import java.util.Scanner;

class OLed {
    boolean state;

    void switchOn(){
        state = true;
    }

    void switchOff(){
        state = false;
    }

    void draw(){
        if(state){
            System.out.print("(*)");
        } else {
            System.out.print("( )");
        }
    }
}

class LedArray {
    OLed[] leds;

    LedArray(int size){
        leds = new OLed[size];
        for (int i = 0; i < size; i++) {
            leds[i] = new OLed();
        }
    }

    void draw(){
        for(OLed led : leds){
            led.draw();
        }
    }

    void switchLed(int position) {
        if (position >= 0 && position < leds.length) {
            OLed led = leds[position];
            if (led.state) {
                led.switchOff();
            } else {
                led.switchOn();
            }
        }
    }
}

public class c5l12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LedArray ledArray = new LedArray(5);

        int position;
        while((position = scanner.nextInt()) != -1){
            ledArray.switchLed(position);

            ledArray.draw();
            System.out.println();
        }
    }
}