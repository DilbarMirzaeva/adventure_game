package adventure_game.Location;

import adventure_game.player.Player;

public class Forest extends Location{
    public Forest(Player player) {
        super(player,"Forest");
    }

    @Override
    public boolean onLocation() {
        return false;
    }
}
