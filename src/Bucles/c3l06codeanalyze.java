package Bucles;

import java.util.*;
public class c3l06codeanalyze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int classCount = 0;
        while (true) {
            String line = sc.nextLine();
            if (line.equals("END")) break;
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.equals("class")) {
                    classCount++;
                }
            }
        }
        System.out.println(classCount);
    }
}
