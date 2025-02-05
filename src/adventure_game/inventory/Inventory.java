package adventure_game.inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    public static List<Weapon> weapons(){
        List<Weapon> weapons=new ArrayList<>();
        weapons.add(new Weapon(1,"Pistol",4,25));
        weapons.add(new Weapon(2,"AK-47",5,25));
        weapons.add(new Weapon(3,"Sniper",6,30));
        return weapons;
    }

    public static Weapon weaponById(int id){
        Weapon weapon=null;
        for(Weapon w:weapons()){
            if(w.getId().equals(id)){
                weapon=w;
            }
        }
        return weapon;
    }
}
