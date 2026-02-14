package Program_Orient_Obj;

import java.util.Locale;
import java.util.Scanner;

class URL {
    String protocol;
    String domain;
    String path;
    String query;
    String fragment;

    public String juntar(String protocol, String domain, String path, String query, String fragment) {
        return protocol + "://" + domain + path + "?" + query + "#" + fragment;
    }

}
public class c6l33urischeme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        URL url = new URL();

        String protocol = scanner.nextLine();
        String domain = scanner.nextLine();
        String path = scanner.nextLine();
        String query = scanner.nextLine();
        String fragment = scanner.nextLine();
        String juntar = url.juntar(protocol, domain, path, query, fragment);

        System.out.println(juntar);
    }
}