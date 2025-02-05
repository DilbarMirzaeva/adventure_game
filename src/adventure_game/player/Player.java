package adventure_game.player;

import adventure_game.inventory.Weapon;

import java.util.InputMismatchException;
import java.util.Scanner;

import static adventure_game.util.InputUtil.getText;
import static adventure_game.util.InputUtil.sc;

public class Player {
    private Integer id;
    private String name;
    private Integer damage;
    private Integer health;
    private Double money;
    private Weapon weapon = new Weapon(0, "none", 0, 0);

    public Player(Integer id, String name, Integer damage, Integer health, Double money) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.money = money;
    }

    public Player() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Player selectCharacter() {
        System.out.println("\tCharacters");
        Samurai samurai = new Samurai();
        Knight knight = new Knight();
        Archer archer = new Archer();
        System.out.println(samurai + "\n" + knight + "\n" + archer);
        System.out.println("------------------------------------------");
        Player player = null;
        while (true) {

            try {
                Integer num = getText("Please choose your character(id): ", Integer.class);
                if (num < 0 || num > 3) {
                    throw new InputMismatchException("please try again(just 1,2,3)");
                } else if (num == 1) {
                    System.out.println("Your character is " + samurai);
                    player = samurai;
                } else if (num == 2) {
                    System.out.println("Your character is " + knight);
                    player = knight;
                } else {
                    System.out.println("Your character is " + archer);
                    player = archer;
                }
                return player;

            } catch (InputMismatchException ie) {
                System.out.println(ie.getMessage());
            }
        }

    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", damage=" + damage +
                ", health=" + health +
                ", money=" + money +
                '}';
    }
}
