package Excepcions;

import java.util.*;
class DividedByZeroException extends Throwable{
    public DividedByZeroException(){

    }
}
public class dividedbyzeroexcept {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        try {
            System.out.println(10/n);
        } catch (ArithmeticException e){
            throw new DividedByZeroException();
        }
    }
}