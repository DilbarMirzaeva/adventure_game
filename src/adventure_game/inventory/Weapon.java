package adventure_game.inventory;

public class Weapon {
    private Integer Id;
    private String name;
    private Integer damage;
    private Integer price;

    public Weapon(Integer id, String name, Integer damage, Integer price) {
        Id = id;
        this.name = name;
        this.damage = damage;
        this.price = price;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", damage=" + damage +
                ", price=" + price +
                '}';
    }
}
