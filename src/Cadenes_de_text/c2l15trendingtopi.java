package Cadenes_de_text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
public class c2l15trendingtopi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> mapa = new HashMap<>();
        for (int i = 0; i < n; i++) {
            while (true) {
                String linea = sc.nextLine();
                if (linea.contains("}")) break;
                int j = 0;
                while (j < linea.length()) {
                    if (linea.charAt(j) == '#') {
                        j++;
                        String hashtag = "";
                        while (j < linea.length() &&
                                Character.isLetterOrDigit(linea.charAt(j))) {
                            hashtag += Character.toLowerCase(linea.charAt(j));
                            j++;
                        }
                        if (!hashtag.isEmpty()) {
                            hashtag = "#" + hashtag;
                            mapa.put(hashtag, mapa.getOrDefault(hashtag, 0) + 1);
                        }
                    } else {
                        j++;
                    }
                }
            }
        }

        ArrayList<String> claves = new ArrayList<>(mapa.keySet());

        claves.sort((a, b) -> {
            int fa = mapa.get(a);
            int fb = mapa.get(b);
            if (fa != fb) return fb - fa;
            return a.compareTo(b);
        });

        for (String h : claves) {
            System.out.println(h + " " + mapa.get(h));
        }
    }
}