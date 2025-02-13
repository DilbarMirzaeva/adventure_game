package adventure_game.inventory;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weapon weapon = (Weapon) o;
        return Objects.equals(Id, weapon.Id) && Objects.equals(name, weapon.name) && Objects.equals(damage, weapon.damage) && Objects.equals(price, weapon.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, damage, price);
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
