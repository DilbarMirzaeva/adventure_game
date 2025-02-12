package adventure_game.player;

public class Samurai extends Player {
    public Samurai() {
        super(1, "Samurai", 7, 30, 20);
    }

    @Override
    public String toString() {
        return "Samurai=> "+super.toString();
    }
}
