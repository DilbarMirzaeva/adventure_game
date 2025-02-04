package adventure_game;

public class Samurai extends Player{
    public Samurai() {
        super(1, "Samurai", 7, 30, 20);
    }

    @Override
    public String toString() {
        return "Samurai: "+super.toString();
    }
}
