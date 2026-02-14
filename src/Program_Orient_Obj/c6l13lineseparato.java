package Program_Orient_Obj;
import java.util.Scanner;

class LineSeparator{
    public int size;
    void print(){
        System.out.println("-".repeat(size));
    }
}
public class c6l13lineseparato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LineSeparator lineSeparator = new LineSeparator();

        while((lineSeparator.size = scanner.nextInt()) != -1){
            System.out.format("Aqui sota hi surt una line  de %d guions%n", lineSeparator.size);
            lineSeparator.print();
        }
    }
}