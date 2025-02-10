package adventure_game.location;

import adventure_game.player.Player;

public class River extends Location{
    public River(Player player) {
        super(player,"River");
    }

    @Override
    public boolean onLocation() {
        return false;
    }
}
