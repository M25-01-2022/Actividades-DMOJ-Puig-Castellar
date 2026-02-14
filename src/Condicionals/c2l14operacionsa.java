package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class c2l14operacionsa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        float n = sc.nextFloat();
        String op = sc.next();
        float m = sc.nextFloat();
        float res;
        switch (op){
            case "+":{
                res = n + m;
                break;
            }
            case "-":{
                res = n - m;
                break;
            }
            case "*":{
                res = n * m;
                break;
            } case "/": {
                if (m != 0){
                    res = n / m;
                    break;
                } else {
                    System.out.print("Error: division by zero");
                    return;
                }
            }
            case "%":{
                if (m != 0){
                    res = n % m;
                    break;
                } else {
                    System.out.print("Error: division by zero");
                    return;
                }
            }
            default: {
                System.out.print("Error: operation not permitted");
                return;
            }
        }
        System.out.print(res);
    }
}