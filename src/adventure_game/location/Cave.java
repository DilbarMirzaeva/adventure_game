package adventure_game.location;

import adventure_game.monster.Monster;
import adventure_game.monster.Zombie;
import adventure_game.player.Player;

public class Cave extends DangerZone{
    public Cave(Player player) {
        super(player, "Cave", new Zombie(), "Food");
    }
}
