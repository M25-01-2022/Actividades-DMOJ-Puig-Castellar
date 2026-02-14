package Bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Patient {
    int id;
    String lastname;
    String name;
    String birthdate;
    double height;
    double weight;
    boolean diabetes;
    boolean hepatitis;

    public Patient(int id, String lastname, String name, String birthdate, double height, double weight, int diabetes, int hepatitis) {
        this.id = id;
        this.lastname = lastname;
        this.name = name;
        this.birthdate = birthdate;
        this.height = height;
        this.weight = weight;
        this.diabetes = diabetes == 1;
        this.hepatitis = hepatitis == 1;
    }

    public double getIMS() {
        return weight / (height * height);
    }
}
public class c5l22select {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<Patient> patients = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split(",", 7);
            String[] idLastname = parts[0].trim().split(" ", 2);
            int id = Integer.parseInt(idLastname[0]);
            String lastname = idLastname[1].trim();
            String name = parts[1].trim();
            String birthdate = parts[2].trim();
            double height = Double.parseDouble(parts[3].trim());
            double weight = Double.parseDouble(parts[4].trim());
            int diabetes = Integer.parseInt(parts[5].trim());
            int hepatitis = Integer.parseInt(parts[6].trim());

            patients.add(new Patient(id, lastname, name, birthdate, height, weight, diabetes, hepatitis));
        }

        printAll(patients);
        printFilteredByName(patients);
        printBirthdateBetween(patients, "1707-04-15", "1937-12-26");
        printIMSBelow(patients, 18.5);
        printIMSAboveWithCondition(patients, 25.0);
    }

    static void printAll(List<Patient> patients) {
        System.out.println("id  |name            |lastname        |birthdate   |height  |wheight |diabetes  |hepatitis ");
        System.out.println("----+----------------+----------------+------------+--------+--------+----------+----------");
        for (Patient p : patients) {
            printPatientRow(p);
        }
        System.out.println("\n");
    }

    static void printFilteredByName(List<Patient> patients) {
        System.out.println("id  |name            |lastname        |birthdate   |height  |wheight |diabetes  |hepatitis ");
        System.out.println("----+----------------+----------------+------------+--------+--------+----------+----------");
        for (Patient p : patients) {
            String lname = p.lastname.toLowerCase();
            String fname = p.name.toLowerCase();
            if (lname.contains("er") || fname.contains("pa")) {
                printPatientRow(p);
            }
        }
        System.out.println("\n");
    }

    static void printBirthdateBetween(List<Patient> patients, String start, String end) {
        System.out.println("name            |lastname        |birthdate   ");
        System.out.println("----------------+----------------+------------");
        for (Patient p : patients) {
            if (p.birthdate.compareTo(start) >= 0 && p.birthdate.compareTo(end) <= 0) {
                System.out.printf("%-16s|%-16s|%12s\n", p.name, p.lastname, p.birthdate);
            }
        }
        System.out.println("\n");
    }

    static void printIMSBelow(List<Patient> patients, double threshold) {
        System.out.println("name            |lastname        |ims     ");
        System.out.println("----------------+----------------+--------");
        for (Patient p : patients) {
            double ims = p.getIMS();
            if (ims < threshold) {
                System.out.printf("%-16s|%-16s|%10.2f\n", p.name, p.lastname, ims);
            }
        }
        System.out.println("\n");
    }

    static void printIMSAboveWithCondition(List<Patient> patients, double threshold) {
        System.out.println("name            |lastname        |ims     ");
        System.out.println("----------------+----------------+--------");
        for (Patient p : patients) {
            double ims = p.getIMS();
            if (ims > threshold && (p.diabetes || p.hepatitis)) {
                System.out.printf("%-16s|%-16s|%10.2f\n", p.name, p.lastname, ims);
            }
        }
        System.out.println("\n");
    }

    static void printPatientRow(Patient p) {
        System.out.printf("%-4d|%-16s|%-16s|%12s|%8.2f|%8.2f|%10s|%10s\n",
                p.id,
                p.name,
                p.lastname,
                p.birthdate,
                p.height,
                p.weight,
                p.diabetes ? "true" : "false",
                p.hepatitis ? "true" : "false");
    }
}