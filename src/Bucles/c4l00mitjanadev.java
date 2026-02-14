package Bucles;

import java.util.Locale;
import java.util.Scanner;
public class c4l00mitjanadev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        double[] monthlyAvg = new double[12];
        int[] heights = new int[12];
        double totalSumHeights = 0;
        for (int i = 0; i < 12; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(",");
            double sum = 0;
            for (String p : parts) {
                sum += Integer.parseInt(p.trim());
            }
            monthlyAvg[i] = sum / days[i];
            heights[i] = (int) monthlyAvg[i];
            totalSumHeights += heights[i];
        }
        double totalAvg = totalSumHeights / 12.0;
        System.out.println("<!DOCTYPE html>");
        System.out.println("<div style=\"display: flex; align-items: baseline;\">");
        for (int i = 0; i < 12; i++) {
            String color = monthlyAvg[i] >= totalAvg ? "blue" : "red";
            System.out.println("    <div style=\"width: 16px; margin: 2px; background-color: " + color + "; height: " + heights[i] + "px;\"></div>");
        }
        int bottom = (int) totalAvg;
        System.out.println("    <div style=\"background-color: green; height: 2px; width: 240px; position: relative; bottom: " + bottom + "px; right: 240px\"></div>");
        System.out.println("</div>");
    }
}