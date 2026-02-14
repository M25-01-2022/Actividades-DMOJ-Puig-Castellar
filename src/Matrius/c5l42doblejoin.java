package Matrius;

import java.util.*;
class Alumne {
    int id;
    String cognoms;
    String nom;
    public Alumne(int id, String cognoms, String nom) {
        this.id = id;
        this.cognoms = cognoms;
        this.nom = nom;
    }
}
class Modul {
    int id;
    String nom;
    public Modul(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
}
class Nota {
    int idAlumne;
    int idModul;
    double nota;
    public Nota(int idAlumne, int idModul, double nota) {
        this.idAlumne = idAlumne;
        this.idModul = idModul;
        this.nota = nota;
    }
}
public class c5l42doblejoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nAlumnes = Integer.parseInt(sc.nextLine().trim());
        Map<Integer, Alumne> alumnes = new HashMap<>();
        for (int i = 0; i < nAlumnes; i++) {
            String line = sc.nextLine().trim();
            int space = line.indexOf(' ');
            int id = Integer.parseInt(line.substring(0, space));
            String[] parts = line.substring(space + 1).split(", ");
            String cognoms = parts[0];
            String nom = parts[1];
            alumnes.put(id, new Alumne(id, cognoms, nom));
        }
        sc.nextLine();
        int nModuls = Integer.parseInt(sc.nextLine().trim());
        Map<Integer, Modul> moduls = new HashMap<>();
        for (int i = 0; i < nModuls; i++) {
            String line = sc.nextLine().trim();
            int space = line.indexOf(' ');
            int id = Integer.parseInt(line.substring(0, space));
            String nom = line.substring(space + 1);
            moduls.put(id, new Modul(id, nom));
        }
        sc.nextLine();
        int nNotes = Integer.parseInt(sc.nextLine().trim());
        List<Nota> notes = new ArrayList<>();
        for (int i = 0; i < nNotes; i++) {
            String[] parts = sc.nextLine().trim().split(" ");
            int idAlumne = Integer.parseInt(parts[0]);
            int idModul = Integer.parseInt(parts[1]);
            double nota = Double.parseDouble(parts[2]);
            notes.add(new Nota(idAlumne, idModul, nota));
        }
        List<String[]> rows = new ArrayList<>();
        int maxCognoms = "cognom".length();
        int maxNom = "nom".length();
        int maxModul = "modul".length();
        int maxNota = "nota".length();
        for (Nota n : notes) {
            Alumne a = alumnes.get(n.idAlumne);
            Modul m = moduls.get(n.idModul);
            if (a != null && m != null) {
                String cognoms = a.cognoms;
                String nom = a.nom;
                String modul = m.nom;
                String notaStr = String.format(Locale.ENGLISH,"%.2f", n.nota);
                rows.add(new String[]{cognoms, nom, modul, notaStr});
                maxCognoms = Math.max(maxCognoms, cognoms.length());
                maxNom = Math.max(maxNom, nom.length());
                maxModul = Math.max(maxModul, modul.length());
                maxNota = Math.max(maxNota, notaStr.length());
            }
        }
        System.out.printf("%-" + maxCognoms + "s|%-" + maxNom + "s|%-" + maxModul + "s|%-" + maxNota + "s\n",
                "cognom", "nom", "modul", "nota");
        System.out.printf("%s+%s+%s+%s\n",
                "-".repeat(maxCognoms),
                "-".repeat(maxNom),
                "-".repeat(maxModul),
                "-".repeat(maxNota));
        for (String[] r : rows) {
            System.out.printf("%-" + maxCognoms + "s|%-" + maxNom + "s|%-" + maxModul + "s|%" + maxNota + "s\n",
                    r[0], r[1], r[2], r[3]);
        }
        System.out.println("(" + rows.size() + " rows)");
    }
}