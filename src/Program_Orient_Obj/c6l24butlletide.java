package Program_Orient_Obj;

import java.util.Locale;
import java.util.Scanner;

class Grade {
    String name;
    float grade;
    float weight;

    Grade(String n, float g, float w) {
        name = n;
        grade = g;
        weight = w;
    }
}

class ReportCard {
    float averageGrade;
    Grade[] grades;

    ReportCard(int numGrades){
        grades = new Grade[numGrades];
    }

    public void calculateAverageGrade() {
        float suma = 0;
        for (Grade g : grades) {
            suma += g.grade * g.weight;
        }
        averageGrade = suma / 100;
    }
}

public class c6l24butlletide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        int n = scanner.nextInt();
        ReportCard reportCard = new ReportCard(n);

        for (int i = 0; i < n; i++) {
            String assignment = scanner.next();
            float grade = scanner.nextFloat();
            float weight = scanner.nextFloat();

            reportCard.grades[i] = new Grade(assignment, grade, weight);
        }

        reportCard.calculateAverageGrade();

        System.out.format(Locale.ENGLISH,"Average Grade: %.2f%n", reportCard.averageGrade);
    }
}