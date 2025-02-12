package adventure_game.location;

import adventure_game.player.Player;

public class SafeHouse extends Location{
    public SafeHouse(Player player) {
        super(player,"SafeHouse");
    }

    @Override
    public boolean onLocation() {
        getPlayer().setHealth(getPlayer().getOriginalHealth());
        System.out.println("Your health fulled!");
        return false;
    }
}
