package Recursivitat;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class c4l42maze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int filas = sc.nextInt();
        sc.nextLine();
        List<String> lineas = new ArrayList<>();
        for (int i = 0; i < filas; i++) lineas.add(sc.nextLine());
        int cols = lineas.getFirst().length();

        char[][] lab = new char[filas][cols];
        int startX = -1, startY = -1;
        for (int i = 0; i < filas; i++) {
            lab[i] = lineas.get(i).toCharArray();
            for (int j = 0; j < cols; j++) {
                if (lab[i][j] == '^') { startX = i; startY = j; }
            }
        }

        interface Resolver { boolean ir(int x, int y); }
        Resolver[] r = new Resolver[1];
        r[0] = (x, y) -> {
            if (x < 0 || x >= filas || y < 0 || y >= cols) return false;
            char c = lab[x][y];
            if (c == '#' || c == 'o') return false;
            if (c == '_') { lab[x][y] = 'o'; return true; }
            lab[x][y] = 'o';
            if (r[0].ir(x-1,y)) return true;
            if (r[0].ir(x+1,y)) return true;
            if (r[0].ir(x,y-1)) return true;
            if (r[0].ir(x,y+1)) return true;
            lab[x][y] = ' ';
            return false;
        };

        r[0].ir(startX, startY);

        for (int i = 0; i < filas; i++) System.out.println(new String(lab[i]));
    }
}