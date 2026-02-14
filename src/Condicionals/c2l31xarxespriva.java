package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class c2l31xarxespriva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int[] ip = new int[4];
        for (int i = 0; i < 4; i++) {
            ip[i] = sc.nextInt();
        }
        int maskBits = sc.nextInt();
        int ipInt = (ip[0] << 24) | (ip[1] << 16) | (ip[2] << 8) | ip[3];
        int mask = maskBits == 0 ? 0 : (-1 << (32 - maskBits));
        int firstIP = ipInt & mask;
        int lastIP = ipInt | ~mask;
        int[] first = new int[4];
        int[] last = new int[4];
        for (int i = 0; i < 4; i++) {
            first[i] = (firstIP >> (24 - 8*i)) & 0xFF;
            last[i] = (lastIP >> (24 - 8*i)) & 0xFF;
        }
        String type = "Public";
        if ((first[0] == 10) ||
                (first[0] == 172 && first[1] >= 16 && first[1] <= 31) ||
                (first[0] == 192 && first[1] == 168)) {
            type = "Private";
        }
        System.out.println("First IP: " + first[0] + "." + first[1] + "." + first[2] + "." + first[3]);
        System.out.println("Last IP: " + last[0] + "." + last[1] + "." + last[2] + "." + last[3]);
        System.out.println(type);
    }
}