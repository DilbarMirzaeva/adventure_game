package adventure_game;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Player {
    private int id;
    private String name;
    private int damage;
    private int health;
    private int money;

    public Player(int id,String name,int damage,int health,int money){
        this.id=id;
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.money=money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void selectCharacter(){
        System.out.println("Please choose your character:");
        System.out.println("Samurai:"+new Samurai());
        System.out.println("Knight:"+new Knight());
        System.out.println("Archer:"+new Archer());

        while (true) {
            Scanner sc = new Scanner(System.in);
            try {

                int num = sc.nextInt();
                if(num<0 || num>3 ){
                    throw new InputMismatchException("please try again(just 1,2,3)");
                }else if(num==1){
                    selectCharacter();
                }
            }catch (InputMismatchException ie){
                System.out.println(ie.getMessage());
                sc.nextLine();
            }

        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", damage=" + damage +
                ", health=" + health +
                ", money=" + money +
                '}';
    }
}
