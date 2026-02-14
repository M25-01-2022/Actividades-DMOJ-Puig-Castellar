package Bucles;

import java.util.*;
public class c3l35maquinadev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        int stock = scanner.nextInt();
        float price = scanner.nextFloat();
        float balance = 0.0f;
        System.out.println("Insert coin");
        while (scanner.hasNext()) {
            String operation = scanner.next();
            if (operation.equals("INSERT")) {
                float amount = scanner.nextFloat();
                balance += amount;
                System.out.println("Balance:" + balance);
            } else if (operation.equals("EXPEND")) {
                if (stock == 0) {
                    System.out.println("Product unavailable");
                    if (balance == 0.0f){
                        System.out.println("Insert coin");
                    } else {
                        System.out.println("Balance:" + balance);
                    }
                } else if (balance < price) {
                    System.out.println("Price:" + price);
                    if (balance > 0) {
                        System.out.println("Balance:" + balance);
                    } else {
                        System.out.println("Insert coin");
                    }
                } else {
                    System.out.println("Your water, thanks");
                    balance -= price;
                    stock--;
                    if (balance > 0) {
                        System.out.println("Balance:" + balance);
                    } else {
                        System.out.println("Insert coin");
                    }
                }
            } else if (operation.equals("REFUND")) {
                System.out.println("Refund:" + balance);
                balance = 0.0f;
                System.out.println("Insert coin");
            } else if (operation.equals("OFF")) {
                break;
            }
        }
    }
}
