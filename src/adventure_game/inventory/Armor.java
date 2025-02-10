package adventure_game.inventory;

public class Armor {
    private Integer id;
    private String name;
    private Integer block;
    private Integer price;

    public Armor(Integer id, String name, Integer block, Integer price) {
        this.id = id;
        this.name = name;
        this.block = block;
        this.price = price;
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

    public Integer getBlock() {
        return block;
    }

    public void setBlock(Integer block) {
        this.block = block;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Armor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", block=" + block +
                ", price=" + price +
                '}';
    }
}
