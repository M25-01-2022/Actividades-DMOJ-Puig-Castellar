package Program_Orient_Obj;

import java.util.Scanner;

class AdvancedLineSeparator {
    public int size;
    public char charSeparator;
    void print(){
        for (int i = 0; i < size; i++) {
            System.out.print(charSeparator);
        }
        System.out.println();
    }
}

public class c6l14advancedline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdvancedLineSeparator lineSeparator = new AdvancedLineSeparator();

        String line;
        while(!(line = scanner.nextLine()).equals("__END__")) {
            lineSeparator.charSeparator = line.charAt(0);
            lineSeparator.size = scanner.nextInt();
            scanner.nextLine();

            System.out.format("Aqui sota apareix una linea de %s %s%n", lineSeparator.size,lineSeparator.charSeparator);
            lineSeparator.print();
        }
    }
}