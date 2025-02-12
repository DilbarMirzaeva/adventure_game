package adventure_game;

import adventure_game.location.*;
import adventure_game.player.Player;

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
            System.out.println("--------------------------------");
            System.out.println(player);
            System.out.println("""
                    #####Locations#####
                    1.SafeHouse
                    2.ToolStore
                    3.Cave
                    4.Forest
                    5.River
                    6.exit
                   ###################
                   """);
            int menu = getText("Choose Location:", Integer.class);
            System.out.println("------------------------------");
            while(menu<=0 || menu>6){
                 menu = getText("This location was not fount,please try again:", Integer.class);
            }
            switch (menu) {
                case 1 -> location = new SafeHouse(player);
                case 2 -> location = new ToolStore(player);
                case 3 -> location = new Cave(player);
                case 4 -> location = new Forest(player);
                case 5 -> location = new River(player);
                case 6 -> bool = false;
            }
            assert location!=null;
            location.onLocation();
        }
    }
}
