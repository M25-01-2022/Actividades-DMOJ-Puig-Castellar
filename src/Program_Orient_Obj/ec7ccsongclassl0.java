package Program_Orient_Obj;

import java.util.Locale;
import java.util.Scanner;

class Song {
    String name;
    String artist;
    float rating;
    boolean favorite;
}
public class ec7ccsongclassl0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        Song song = new Song();

        song.name=scanner.nextLine();
        song.artist=scanner.nextLine();
        song.rating=scanner.nextFloat();
        song.favorite=scanner.nextBoolean();

        System.out.print(song.favorite ? "<3 " : "   ");
        System.out.println(song.artist + " - " + song.name);
        for (int i = 0; i < (int) song.rating; i++) {
            System.out.print("*");
        }
    }
}