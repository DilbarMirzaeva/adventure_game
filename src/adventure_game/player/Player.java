package adventure_game.player;

import adventure_game.inventory.Armor;
import adventure_game.inventory.Weapon;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import static adventure_game.util.InputUtil.getText;

public class Player {
    private Integer id;
    private String name;
    private Integer damage;
    private Integer health;
    private Integer originalHealth;
    private Integer money;
    private Weapon weapon = new Weapon(0, "none", 0, 0);
    private Armor armor = new Armor(0, "none", 0, 0);
    private final List<String> award = new ArrayList<>();
    private final List<Armor> armorList=new ArrayList<>();
    private final List<Weapon> weaponList=new ArrayList<>();


    public Player(Integer id, String name, Integer damage, Integer health, Integer money) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.originalHealth=health;
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
        if(health<0){
            health=0;
        }
        this.health = health;
    }

    public Integer getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(Integer originalHealth) {
        this.originalHealth = originalHealth;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public List<String> getAward() {
        return award;
    }

    public void setAward(String award){
        this.award.add(award);
    }

    public List<Armor> getArmorList() {
        return armorList;
    }

    public void setArmorList(Armor armor) {
        this.armorList.add(armor);
    }

    public List<Weapon> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(Weapon weapon) {
        this.weaponList.add(weapon);
    }

    public Player selectCharacter() {
        System.out.println("\t\t######Characters#######");
        Samurai samurai = new Samurai();
        Knight knight = new Knight();
        Archer archer = new Archer();
        System.out.println(samurai + "\n" + knight + "\n" + archer);
        System.out.println("------------------------------------------");
        while (true) {

            try {
                Integer num = getText("Please choose your character(id): ", Integer.class);
                Player player;
                if (num <= 0 || num > 3) {
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
