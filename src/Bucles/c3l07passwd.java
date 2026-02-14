package Bucles;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Locale;
import java.util.Scanner;
public class c3l07passwd {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int uid = i + 1000;
            int password = (uid << 29 ^ uid << 17) >>> 1;
            String encrypted = Base64.getEncoder().encodeToString(
                    MessageDigest.getInstance("MD5")
                            .digest(String.valueOf(password).getBytes())
            );
            System.out.println("user" + uid +
                    ":$1$" + encrypted +
                    ":" + uid +
                    ":1000:Usuari " + uid +
                    ":/home/user" + uid +
                    ":/bin/bash");
        }
    }
}