package Excepcions;

import java.util.*;
public class inputmissmatchexcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        try{
            int n = sc.nextInt();
            System.out.println(n);
        } catch (InputMismatchException e){
            System.out.println("Cal introduïr un nombre enter!");
        }
    }
}