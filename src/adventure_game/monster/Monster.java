package adventure_game.monster;

public class Monster {
    private Integer id;
    private String name;
    private Integer damage;
    private Integer originalDamage;
    private Integer originalHealth;
    private Integer health;
    private Integer money;

    public Monster(Integer id, String name, Integer damage, Integer health, Integer money) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.originalHealth=health;
        this.originalDamage=damage;
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

    public Integer getOriginalDamage() {
        return originalDamage;
    }

    public void setOriginalDamage(Integer originalDamage) {
        this.originalDamage = originalDamage;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", damage=" + damage +
                ", health=" + health +
                ", money=" + money +
                '}';
    }
}
