import java.util.ArrayList;

public class Item {

    private String itemNum;
    private String name;
    private String type;
    private String heroName;
    private String heroClass;


    public Item(String itemNum, String name, String type, String heroName, String heroClass) {
        this.itemNum = itemNum;
        this.name = name;
        this.type = type;
        this.heroName = heroName;
        this.heroClass = heroClass;
    }


    public ArrayList<Item> allInOne = new ArrayList<Item>();
    public ArrayList<Item> uniqueWeapon = new ArrayList<Item>();
    public ArrayList<Item> uniqueTreasure = new ArrayList<Item>();
    public ArrayList<Item> ether = new ArrayList<Item>();
}
