package Bucles;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
public class c4l41accesloganalyze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        HashMap<String, Integer> hostCount = new HashMap<>();
        HashMap<String, Integer> resourceCount = new HashMap<>();
        HashMap<String, Integer> referrerCount = new HashMap<>();
        HashMap<String, Integer> agentCount = new HashMap<>();
        HashMap<Integer, Integer> hourCount = new HashMap<>();
        while (true) {
            String line = sc.nextLine();
            if (line.equals("__END__")) break;

            String host = line.split(" ")[0];
            hostCount.put(host, hostCount.getOrDefault(host, 0) + 1);

            int startBracket = line.indexOf('[');
            int colonAfterDate = line.indexOf(':', startBracket);
            int hour = Integer.parseInt(line.substring(colonAfterDate + 1, colonAfterDate + 3));
            hourCount.put(hour, hourCount.getOrDefault(hour, 0) + 1);

            hourCount.put(hour, hourCount.getOrDefault(hour, 0) + 1);

            int firstQuote = line.indexOf('"');
            int secondQuote = line.indexOf('"', firstQuote + 1);
            String request = line.substring(firstQuote + 1, secondQuote);
            String resource = request.split(" ")[1];
            resourceCount.put(resource, resourceCount.getOrDefault(resource, 0) + 1);

            int thirdQuote = line.indexOf('"', secondQuote + 1);
            int fourthQuote = line.indexOf('"', thirdQuote + 1);
            String referrer = line.substring(thirdQuote + 1, fourthQuote);
            referrerCount.put(referrer, referrerCount.getOrDefault(referrer, 0) + 1);

            int fifthQuote = line.indexOf('"', fourthQuote + 1);
            int sixthQuote = line.indexOf('"', fifthQuote + 1);
            String agent = line.substring(fifthQuote + 1, sixthQuote + 1);
            agentCount.put(agent, agentCount.getOrDefault(agent, 0) + 1);
        }
        System.out.println(maxKey(hostCount));
        System.out.println(maxKey(resourceCount));
        System.out.println(maxKey(referrerCount));
        System.out.println(maxKey(agentCount));
        System.out.println(maxKeyInt(hourCount));
    }
    static String maxKey(HashMap<String, Integer> map) {
        String best = "";
        int max = -1;
        for (String key : map.keySet()) {
            int value = map.get(key);
            if (value > max) {
                max = value;
                best = key;
            }
        }
        return best;
    }
    static String maxKeyInt(HashMap<Integer, Integer> map) {
        int best = -1;
        int max = -1;

        for (int key : map.keySet()) {
            int value = map.get(key);
            if (value > max) {
                max = value;
                best = key;
            }
        }
        return String.valueOf(best);
    }
}