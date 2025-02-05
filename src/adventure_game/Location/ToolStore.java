package adventure_game.Location;

import adventure_game.inventory.Inventory;
import adventure_game.inventory.Weapon;
import adventure_game.player.Player;

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
                1.Weapon
                2.Armor
                3.BackToMenu
                """);
        Integer choose = getText("Your choice:", Integer.class);

        switch (choose) {
            case 1:
                selectWeapon();
                break;
            case 2:

        }
        return false;
    }

    public void selectWeapon() {

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
            System.out.println("You don't have enough money");
        }
    }

}
