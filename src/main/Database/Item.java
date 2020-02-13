import java.util.ArrayList;

public class Item {

    private String type;
    private String name;
    private String heroClass;

    public Item(String type, String name, String heroClass) {
        this.type = type;
        this.name = name;
        this.heroClass = heroClass;
    }

    public ArrayList<Item> allInOne = new ArrayList<Item>();
    public ArrayList<Item> uniqueWeapon = new ArrayList<Item>();
    public ArrayList<Item> ether = new ArrayList<Item>();
}
