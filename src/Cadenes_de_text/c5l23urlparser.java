package Cadenes_de_text;

import java.util.Locale;
import java.util.Scanner;
public class c5l23urlparser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String url = sc.nextLine();
        int idxScheme = url.indexOf("://");

        String scheme = url.substring(0, idxScheme);
        String rest = url.substring(idxScheme + 3);

        int idxAt = rest.indexOf("@");
        String userPass = rest.substring(0, idxAt);
        String user = userPass.substring(0, userPass.indexOf(":"));
        String password = userPass.substring(userPass.indexOf(":") + 1);

        rest = rest.substring(idxAt + 1);
        int idxSlash = rest.indexOf("/");
        String hostPort = rest.substring(0, idxSlash);
        String host = hostPort.substring(0, hostPort.indexOf(":"));
        int port = Integer.parseInt(hostPort.substring(hostPort.indexOf(":") + 1));

        rest = rest.substring(idxSlash + 1);

        int idxQuestion = rest.indexOf("?");
        String pathStr = rest.substring(0, idxQuestion);
        String[] path = pathStr.split("/");

        rest = rest.substring(idxQuestion + 1);

        int idxHash = rest.indexOf("#");
        String queryStr = rest.substring(0, idxHash);
        String[] query = queryStr.split("&");

        String fragment = rest.substring(idxHash + 1);

        System.out.println("String scheme = \"" + scheme + "\";");
        System.out.println("String user = \"" + user + "\";");
        System.out.println("String password = \"" + password + "\";");
        System.out.println("String host = \"" + host + "\";");
        System.out.println("int port = " + port + ";");

        System.out.print("String[] path = {");
        for (int i = 0; i < path.length; i++) {
            System.out.print("\"" + path[i] + "\"");
            if (i < path.length - 1) System.out.print(", ");
        }
        System.out.println("};");

        System.out.print("String[] query = {");
        for (int i = 0; i < query.length; i++) {
            System.out.print("\"" + query[i] + "\"");
            if (i < query.length - 1) System.out.print(", ");
        }
        System.out.println("};");
        System.out.println("String fragment = \"" + fragment + "\";");
    }
}