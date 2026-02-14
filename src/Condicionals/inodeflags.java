package Condicionals;

import java.util.Locale;
import java.util.Scanner;
public class inodeflags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        String[] nombres = {
                "EXT4_NOATIME_FL",
                "EXT4_NODUMP_FL",
                "EXT4_APPEND_FL",
                "EXT4_IMMUTABLE_FL",
                "EXT4_SYNC_FL",
                "EXT4_COMPR_FL",
                "EXT4_UNRM_FL",
                "EXT4_SECRM_FL"
        };
        int[] puntuaciones = {
                128, 64, 32, 16, 8, 4, 2, 1
        };
        for (int i = 0; i < nombres.length; i++) {
            if (n >= puntuaciones[i]) {
                System.out.println(nombres[i]);
                n -= puntuaciones[i];
            }
        }
    }
}