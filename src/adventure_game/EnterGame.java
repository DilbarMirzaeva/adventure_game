package adventure_game;

import adventure_game.player.Archer;
import adventure_game.player.Knight;
import adventure_game.player.Player;
import adventure_game.player.Samurai;
import adventure_game.util.InputUtil;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static adventure_game.util.InputUtil.getText;

public class EnterGame {

    public static void start() {
        System.out.println("\n\t\t\t--Welcome AdventureGame--");
        System.out.println("------------------------------------------");
        String name= getText("Enter the name:",String.class);
        System.out.println("Hello " + name + "! Everything you see here is real!");
        System.out.println("------------------------------------------");
        Player player=new Player();
        player.selectCharacter();


    }
}
