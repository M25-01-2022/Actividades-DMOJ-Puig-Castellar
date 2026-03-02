package ProgramaMe;

import java.util.*;
public class campana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine().trim();
            if (s.isEmpty()) continue;
            Map<Character, Integer> freq = new HashMap<>();
            for (char c : s.toCharArray()) {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
            int maxFreq = 0;
            for (int count : freq.values()) {
                maxFreq = Math.max(maxFreq, count);
            }
            int n = s.length();
            if (maxFreq <= (n + 1) / 2) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}