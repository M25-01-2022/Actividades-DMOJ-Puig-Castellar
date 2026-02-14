package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class streetfighter1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String estado = sc.next();
        String evento = sc.next();
        switch (estado) {
            case "IDLE":
                if (evento.equals("JOYSTICK_UP")) estado = "JUMPING";
                else if (evento.equals("JOYSTICK_LEFT/RIGHT")) estado = "WALKING";
                else if (evento.equals("PUNCH_KEY")) estado = "PUNCHING";
                else if (evento.equals("KICK_KEY")) estado = "KICKING";
                break;
            case "WALKING":
                if (evento.equals("JOYSTICK_UP")) estado = "JUMPING";
                else if (evento.equals("JOYSTICK_CENTER")) estado = "IDLE";
                else if (evento.equals("PUNCH_KEY")) estado = "PUNCHING";
                else if (evento.equals("KICK_KEY")) estado = "KICKING";
                break;
            case "JUMPING":
                if (evento.equals("TOUCH_FLOOR")) estado = "IDLE";
                else if (evento.equals("PUNCH_KEY")) estado = "PUNCHING";
                else if (evento.equals("KICK_KEY")) estado = "KICKING";
                break;
            case "PUNCHING":
                if (evento.equals("PUNCH_END")) estado = "IDLE";
                break;
            case "KICKING":
                if (evento.equals("KICK_END")) estado = "IDLE";
                break;
        }
        System.out.println(estado);
    }
}