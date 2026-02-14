package Program_Orient_Obj;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Coords {
    int x, y;
}

class Player2 {
    String name;
    Coords position;
    int score;
}

class Game2 {
    int width;
    int height;
    Player2 player1;
    Player2 player2;
}

public class f2eb6players {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Game2 game = new Game2();
        game.player1 = new Player2();
        game.player2 = new Player2();
        game.player1.position = new Coords();
        game.player2.position = new Coords();

        game.width = sc.nextInt();
        game.height = sc.nextInt();

        game.player1.name = sc.next();
        game.player1.score = sc.nextInt();
        game.player1.position.x = sc.nextInt();
        game.player1.position.y = sc.nextInt();

        game.player2.name = sc.next();
        game.player2.score = sc.nextInt();
        game.player2.position.x = sc.nextInt();
        game.player2.position.y = sc.nextInt();

        System.out.println("P1:" + game.player1.name + " #" + game.player1.score + " {"+game.player1.position.x+", "+game.player1.position.y+"}");
        System.out.println("P2:" + game.player2.name + " #" + game.player2.score + " {"+game.player2.position.x+", "+game.player2.position.y+"}");
    }
}