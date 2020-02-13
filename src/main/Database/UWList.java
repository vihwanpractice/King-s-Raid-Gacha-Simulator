import java.util.ArrayList;

public class UWList{


    private ArrayList<Item> info =  new ArrayList<Item>();

    public ArrayList<Item> info(){
        info.add(new Item("001","수호의 엑시안","uw","클라우스","기사"));
        info.add(new Item("002","변하지 않는 마음 에레쿠라","uw","제인","기사"));

        return info;
    }

}
