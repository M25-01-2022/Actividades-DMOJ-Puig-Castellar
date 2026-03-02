package ProgramaMe;

import java.util.*;
public class ninots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 0) break;
            Map<String, Integer> nene = new HashMap<>();
            Map<String, Integer> adulto = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String voto = sc.next();
                if (Character.isLowerCase(voto.charAt(0))) {
                    nene.put(voto, nene.getOrDefault(voto, 0) + 1);
                } else {
                    adulto.put(voto, adulto.getOrDefault(voto, 0) + 1);
                }
            }
            String ganInfantil = obtenerGanador(nene, false);
            String ganAdulto = obtenerGanador(adulto, true);

            output.append(ganInfantil).append(" ").append(ganAdulto).append("\n");
        }
        System.out.print(output);
    }
    private static String obtenerGanador(Map<String, Integer> mapa, boolean esAdulto) {
        if (mapa.isEmpty()) {
            return esAdulto ? "EMPATE" : "empate";
        }
        int maxVotos = Integer.MIN_VALUE;
        String winner = "";
        boolean hayEmpate = false;
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            int votos = entry.getValue();
            if (votos > maxVotos) {
                maxVotos = votos;
                winner = entry.getKey();
                hayEmpate = false;
            } else if (votos == maxVotos) {
                hayEmpate = true;
            }
        }
        if (hayEmpate) {
            return esAdulto ? "EMPATE" : "empate";
        }
        return winner;
    }
}