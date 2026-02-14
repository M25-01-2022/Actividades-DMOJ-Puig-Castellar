package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class estadistiquesaltea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int[] divendres = new int[3];
        int[] dissabte  = new int[3];
        int[] diumenge  = new int[3];
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String dia = sc.nextLine();
            while (true) {
                int edat = sc.nextInt();
                if (edat == -1) break;
                if (dia.equals("divendres")) {
                    if (edat < 18) divendres[0]++;
                    else if (edat <= 65) divendres[1]++;
                    else divendres[2]++;
                }
                else if (dia.equals("dissabte")) {
                    if (edat < 18) dissabte[0]++;
                    else if (edat <= 65) dissabte[1]++;
                    else dissabte[2]++;
                }
                else {
                    if (edat < 18) diumenge[0]++;
                    else if (edat <= 65) diumenge[1]++;
                    else diumenge[2]++;
                }
            }
            sc.nextLine();
        }
        System.out.println("divendres");
        System.out.println("0-17 : " + divendres[0]);
        System.out.println("18-65: " + divendres[1]);
        System.out.println("+65  : " + divendres[2]);
        System.out.println();

        System.out.println("dissabte");
        System.out.println("0-17 : " + dissabte[0]);
        System.out.println("18-65: " + dissabte[1]);
        System.out.println("+65  : " + dissabte[2]);
        System.out.println();

        System.out.println("diumenge");
        System.out.println("0-17 : " + diumenge[0]);
        System.out.println("18-65: " + diumenge[1]);
        System.out.println("+65  : " + diumenge[2]);
    }
}