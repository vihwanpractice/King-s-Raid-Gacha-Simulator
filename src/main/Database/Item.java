import java.util.ArrayList;

public class Item {

    private int itemNum;
    private String name;
    private String type;
    private String heroName;
    private String heroClass;
    private int starNum;

    public Item(int itemNum, String name, String type, String heroName, String heroClass, int starNum) {
        this.itemNum = itemNum;
        this.name = name;
        this.type = type;
        this.heroName = heroName;
        this.heroClass = heroClass;
        this.starNum = starNum;
    }


    public ArrayList<Item> allInOne = new ArrayList<Item>();
    public ArrayList<Item> uniqueWeapon = new ArrayList<Item>();
    public ArrayList<Item> uniqueTreasure = new ArrayList<Item>();
    public ArrayList<Item> ether = new ArrayList<Item>();
}
