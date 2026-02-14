package Matrius;

import java.util.*;
class Product {
    int id;
    int merchantId;
    String name;
    double price;
    public Product(int id, int merchantId, String name, double price) {
        this.id = id;
        this.merchantId = merchantId;
        this.name = name;
        this.price = price;
    }
}
class Merchant {
    int id;
    String name;
    public Merchant(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class c5l31join {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int nProducts = Integer.parseInt(sc.nextLine().trim());
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < nProducts; i++) {
            String[] parts = sc.nextLine().trim().split(" ", 4);
            int id = Integer.parseInt(parts[0]);
            int merchantId = Integer.parseInt(parts[1]);
            String name = parts[2];
            double price = Double.parseDouble(parts[3]);
            products.add(new Product(id, merchantId, name, price));
        }
        sc.nextLine();
        int nMerchants = Integer.parseInt(sc.nextLine().trim());
        Map<Integer, String> merchants = new HashMap<>();
        for (int i = 0; i < nMerchants; i++) {
            String[] parts = sc.nextLine().trim().split(" ", 2);
            int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            merchants.put(id, name);
        }
        System.out.println("name            |merchant        |price     ");
        System.out.println("----------------+----------------+----------");
        int rowCount = 0;
        for (Product p : products) {
            if (merchants.containsKey(p.merchantId)) {
                String merchantName = merchants.get(p.merchantId);
                System.out.printf("%-16s|%-16s|%10.2f\n", p.name, merchantName, p.price);
                rowCount++;
            }
        }
        System.out.println("(" + rowCount + " rows)");
    }
}