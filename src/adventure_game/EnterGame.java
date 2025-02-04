package adventure_game;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EnterGame {

    public void start() {
        System.out.println("Welcome AdventureGame");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name:");
        String user = sc.nextLine();
        System.out.println("Hello " + user + "! Everything you see here is real!");

    }
}
