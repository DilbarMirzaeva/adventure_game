package adventure_game.player;

public class Samurai extends Player {
    public Samurai() {
        super(1, "Samurai", 7, 35, 20);
    }

    @Override
    public String toString() {
        return "Samurai=> "+super.toString();
    }
}
