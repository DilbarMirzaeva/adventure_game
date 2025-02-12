package adventure_game.player;

public class Archer extends Player {
    public Archer() {
        super(3, "Archer", 8, 25, 30);
    }

    @Override
    public String toString() {
        return "Archer=> "+super.toString();
    }
}
