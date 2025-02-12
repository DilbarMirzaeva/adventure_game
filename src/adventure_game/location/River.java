package adventure_game.location;

import adventure_game.monster.Bear;
import adventure_game.player.Player;

public class River extends DangerZone{
    public River(Player player) {
        super(player, "River", new Bear(), "Water");
    }
}
