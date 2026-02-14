package Program_Orient_Obj;

import java.util.Locale;
import java.util.Scanner;

class Product{
    String name;
    float price;
}
class ShoppingCart{
    public Product[] products;
}
public class ea92eshoppingcart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        ShoppingCart shoppingCart = new ShoppingCart();

        int nProducts = scanner.nextInt();
        scanner.nextLine();

        shoppingCart.products = new Product[nProducts];

        for (int i = 0; i < nProducts; i++) {
            shoppingCart.products[i] = new Product();
            shoppingCart.products[i].name = scanner.nextLine();
            shoppingCart.products[i].price = scanner.nextFloat();
            scanner.nextLine();
        }

        System.out.println("ShoppingCart");
        for (int i = 0; i < nProducts; i++) {
            System.out.format(Locale.ENGLISH, "%40s  %6.2f%n", shoppingCart.products[i].name, shoppingCart.products[i].price);
        }
    }
}