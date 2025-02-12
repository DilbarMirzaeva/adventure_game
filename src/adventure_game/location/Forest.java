package adventure_game.location;

import adventure_game.monster.Vampire;
import adventure_game.player.Player;

public class Forest extends DangerZone{
    public Forest(Player player) {
        super(player, "Forest", new Vampire(), "Firewood");
    }

}
