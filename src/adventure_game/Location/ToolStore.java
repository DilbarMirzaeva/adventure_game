package adventure_game.Location;

import adventure_game.player.Player;

public class ToolStore extends Location{
    public ToolStore(Player player) {
        super(player,"ToolStore");
    }

    @Override
    public boolean onLocation() {
        return false;
    }
}
