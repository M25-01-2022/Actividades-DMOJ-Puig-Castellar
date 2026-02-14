package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class banderas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int T = sc.nextInt();
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < N; j++) {
                char c = '?';
                switch (T) {
                    case 1:
                        if (j < i) c = '~';
                        else c = '*';
                        break;
                    case 2:
                        if (i < N / 2) c = '*';
                        else c = '~';
                        break;
                    case 3:
                        if (j >= N / 2) c = '~';
                        else c = '*';
                        break;
                    case 4:
                        if (j == i) c = '*';
                        else c = '~';
                        break;
                    case 5:
                        if ((i % 2) == 0) c = '*';
                        else c = '~';
                        break;
                    case 6:
                        if (i < N / 3) c = '*';
                        else if (i < 2 * (N / 3)) c = '~';
                        else c = '*';
                        break;
                    case 7:
                        if (j < N / 3) c = '~';
                        else if (j < 2 * (N / 3)) c = '*';
                        else c = '~';
                        break;
                    case 8:
                        if ((j % 2) == 0) c = '*';
                        else c = '~';
                        break;
                    default:
                        System.out.println();
                }
                sb.append(c);
            }
            System.out.println(sb);
        }
    }
}