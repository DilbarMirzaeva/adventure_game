package adventure_game.player;

public class Knight extends Player {
    public Knight() {
        super(2, "Knight", 6, 16, 25.0);
    }

    @Override
    public String toString() {
        return "Knight=> "+super.toString();
    }
}
