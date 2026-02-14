package Vectors_estatics;

import java.util.*;
class Host {
    String ip;
    int ram;
    int cpu;
    int disc;
    Host(String ip, int ram, int cpu, int disc) {
        this.ip = ip;
        this.ram = ram;
        this.cpu = cpu;
        this.disc = disc;
    }
    public static int compareIP(String ip1, String ip2) {
        String[] p1 = ip1.split("\\.");
        String[] p2 = ip2.split("\\.");
        for (int i = 0; i < 4; i++) {
            int n1 = Integer.parseInt(p1[i]);
            int n2 = Integer.parseInt(p2[i]);
            if (n1 != n2) {
                return n1 - n2;
            }
        }
        return 0;
    }
    @Override
    public String toString() {
        return ip + " " + ram + " " + cpu + " " + disc;
    }
}
public class c4l31inventarien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String[] order = sc.nextLine().trim().split("\\s+");
        List<Host> hosts = new ArrayList<>();
        while (true) {
            String line = sc.nextLine().trim();
            if (line.equals("__END__")) break;
            if (line.isEmpty()) continue;
            String[] parts = line.split("\\s+");
            String ip = parts[0];
            int ram = Integer.parseInt(parts[1]);
            int cpu = Integer.parseInt(parts[2]);
            int disc = Integer.parseInt(parts[3]);
            hosts.add(new Host(ip, ram, cpu, disc));
        }
        Collections.sort(hosts, (h1, h2) -> {
            for (String field : order) {
                int cmp = 0;
                switch (field) {
                    case "CPU":
                        cmp = h2.cpu - h1.cpu;
                        break;
                    case "RAM":
                        cmp = h2.ram - h1.ram;
                        break;
                    case "DISC":
                        cmp = h2.disc - h1.disc;
                        break;
                    case "IP":
                        cmp = Host.compareIP(h1.ip, h2.ip);
                        break;
                }
                if (cmp != 0) return cmp;
            }
            return 0;
        });
        for (Host h : hosts) {
            System.out.println(h);
        }
    }
}