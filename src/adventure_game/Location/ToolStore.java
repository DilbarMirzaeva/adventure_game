package adventure_game.Location;

import adventure_game.inventory.Armor;
import adventure_game.inventory.Inventory;
import adventure_game.inventory.Weapon;
import adventure_game.player.Player;

import static adventure_game.inventory.Inventory.armors;
import static adventure_game.inventory.Inventory.weapons;
import static adventure_game.util.InputUtil.getText;

public class ToolStore extends Location {
    public ToolStore(Player player) {
        super(player, "ToolStore");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are at " + getName() + ", you can buy weapon or armor.");
        System.out.print("""
                ***
                1.Weapon
                2.Armor
                3.BackToMenu
                ***
                """);
        Integer choose = getText("Your choice:", Integer.class);
        while(choose<0 || choose>3){
            System.out.println("Please try again(just 1,2 or 3)");
             choose = getText("Your choice:", Integer.class);

        }

        switch (choose) {
            case 1:
                selectWeapon();
                break;
            case 2:
                selectArmor();
            case 3:
                return false;
        }
        return false;
    }

    public void selectWeapon() {
        System.out.println("-----------------------------");
        System.out.println("Your balance : " + getPlayer().getMoney());
        System.out.println(weapons());
        Integer selectedId = getText("Enter the weapon Id:", Integer.class);
        Weapon selectedWeapon = Inventory.weaponById(selectedId);
        if (getPlayer().getMoney() >= selectedWeapon.getPrice()) {
            System.out.println("Your old weapon: " + getPlayer().getWeapon());
            getPlayer().setWeapon(selectedWeapon);
            System.out.println("Your new weapon: " + getPlayer().getWeapon());
            getPlayer().setMoney(getPlayer().getMoney() - selectedWeapon.getPrice());
        } else {
            System.out.println("You don't have enough money..");
        }
        System.out.println("-----------------------------");

    }

    public void selectArmor(){
        System.out.println("-----------------------------");
        System.out.println("Your balance : "+getPlayer().getMoney());
        System.out.println(armors());
        Integer selectedId=getText("Enter the armor Id : ",Integer.class);
        Armor selectedArmor=Inventory.armorById(selectedId);
        if(getPlayer().getMoney() >= selectedArmor.getPrice()){
            System.out.println("Your old armor : "+getPlayer().getArmor());
            getPlayer().setArmor(selectedArmor);
            System.out.println("Your new armor : "+getPlayer().getArmor() );
            getPlayer().setMoney(getPlayer().getMoney()-selectedArmor.getPrice());
        }else {
            System.out.println("You don't have enough money..");
        }
        System.out.println("-----------------------------");

    }

}
