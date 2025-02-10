package adventure_game.inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    public static List<Weapon> weapons() {
        List<Weapon> weapons = new ArrayList<>();
        weapons.add(new Weapon(1, "Pistol", 4, 20));
        weapons.add(new Weapon(2, "AK-47", 5, 25));
        weapons.add(new Weapon(3, "Sniper", 6, 30));
        return weapons;
    }

    public static Weapon weaponById(int id) {
        Weapon weapon = null;
        for (Weapon w : weapons()) {
            if (w.getId().equals(id)) {
                weapon = w;
            }
        }
        return weapon;
    }

    public static List<Armor> armors() {
        List<Armor> armors = new ArrayList<>();
        armors.add(new Armor(1, "Light", 1, 15));
        armors.add(new Armor(2, "Medium", 3, 25));
        armors.add(new Armor(3, "Heavy", 5, 40));
        return armors;
    }

    public static Armor armorById(int id) {
        Armor armor = null;
        for (Armor a : armors()) {
            if (a.getId() == id) {
                armor = a;
            }
        }
        return armor;
    }
}
