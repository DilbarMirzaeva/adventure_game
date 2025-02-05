package adventure_game;

import adventure_game.Location.*;
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
        String name = getText("Enter the name:", String.class);
        System.out.println("Hello " + name + "! Everything you see here is real!");
        System.out.println("------------------------------------------");
        Player player1 = new Player();
        Player player=player1.selectCharacter();
        Location location = null;
        boolean bool=true;
        while (bool) {
            System.out.println("""
                    #####Locations#####
                    1.SafeHouse
                    2.ToolStore
                    3.Cave
                    4.Forest
                    5.River
                    6.exit
                    """);
            int menu = getText("Choose Location:", Integer.class);
            switch (menu) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    location.onLocation();
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                case 6:
                    bool=false;
            }
        }
    }
}
