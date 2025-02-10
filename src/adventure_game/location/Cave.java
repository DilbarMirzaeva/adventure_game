package adventure_game.location;

import adventure_game.player.Player;

public class Cave extends Location{
    public Cave(Player player) {
        super(player,"Cave");
    }

    @Override
    public boolean onLocation() {
        return false;
    }
}
