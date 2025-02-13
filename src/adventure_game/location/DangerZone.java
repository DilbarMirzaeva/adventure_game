package adventure_game.location;

import adventure_game.monster.Monster;
import adventure_game.player.Player;

import java.util.Random;
import java.util.stream.Stream;

import static adventure_game.util.InputUtil.getText;

public class DangerZone extends Location {
    private Monster monster;
    private String award;

    public DangerZone(Player player, String name, Monster monster, String award) {
        super(player, name);
        this.monster = monster;
        this.award = award;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    @Override
    public boolean onLocation() {
        for (String s : getPlayer().getAward()) {
            if ((this instanceof Cave && s.equals("Food"))
                    || (this instanceof Forest && s.equals("Firewood"))
                    || (this instanceof River && s.equals("Water"))) {
                System.out.println("You have already fought this zone and collect the award.");
                return false;
            }

        }

        System.out.println("You are at " + getName() + ". Be careful,there have " + getMonster().getName());
        Random random = new Random();
        int monsterCount = random.nextInt(3) + 1;
        System.out.println("Oh, there have " + monsterCount + " " + getMonster().getName() + ".They are attacking you !!!");

        for (int i = 0; i < monsterCount; i++) {
            monster.setHealth(monster.getOriginalHealth());
            System.out.println(monster);
            System.out.println(getPlayer());
            int opt = getText("""
                    ----------
                    1.Fight with monster(s)
                    2.Leave there
                    ----------
                    """, Integer.class);

            while (opt < 0 || opt > 2) {
                opt = getText("Invalid input,try again(1 or 2)", Integer.class);
            }

            switch (opt) {
                case 1:
                    if (!getPlayer().getArmor().equals("none")) {
                        monster.setDamage(monster.getDamage() - getPlayer().getArmor().getBlock());
                    }

                    while (getPlayer().getHealth() > 0 && getMonster().getHealth() > 0) {
                        boolean bool = random.nextBoolean();
                        if (bool) {
                            System.out.println("------------------------------");
                            if (getPlayer().getHealth() > 0) {
                                monster.setHealth(monster.getHealth() - getPlayer().getDamage());
                                System.out.printf("You hit the %s, %s health %d: \n", monster.getName(), monster.getName(), monster.getHealth());
                            }
                            if (monster.getHealth() > 0) {
                                getPlayer().setHealth(getPlayer().getHealth() - monster.getDamage());
                                System.out.printf("Monster hit you,your health %d: \n", getPlayer().getHealth());
                            }
                        } else {
                            if (monster.getHealth() > 0) {
                                getPlayer().setHealth(getPlayer().getHealth() - monster.getDamage());
                                System.out.printf("Monster hit you,your health %d: \n", getPlayer().getHealth());
                            }
                            if (getPlayer().getHealth() > 0) {
                                monster.setHealth(monster.getHealth() - getPlayer().getDamage());
                                System.out.printf("You hit the %s, %s health %d: \n", monster.getName(), monster.getName(), monster.getHealth());
                            }
                            System.out.println("------------------------------");
                        }

                        if (monster.getHealth() <= 0) {
                            System.out.printf("$$ You killed the %d.%s and won %d loot! $$\n", i + 1, monster.getName(), monster.getMoney());
                            getPlayer().setMoney(getPlayer().getMoney() + monster.getMoney());
                            System.out.println("------------------------------");
                        }

                        if (getPlayer().getHealth() <= 0) {
                            System.err.println("YOU ARE DEAD, GAME OVER..");
                            return true;
                        }
                    }
                    monster.setDamage(monster.getOriginalDamage());
                    break;

                case 2:
                    return false;
            }
        }
        System.out.printf("$$ Congratulations,you killed all of the %s!! Your award: %s $$\n", monster.getName(), getAward());
        getPlayer().setAward(getAward());
        if (Stream.of("Food", "Water", "Firewood").allMatch(getPlayer().getAward()::contains)) {
            System.err.println("YOU KILLED ALL MONSTERS, YOU WON THE GAME!!!");
            return true;
        }
        return false;
    }

}



