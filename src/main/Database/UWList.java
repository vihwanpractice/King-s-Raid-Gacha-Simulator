import java.util.ArrayList;

public class UWList{


    private ArrayList<Item> info =  new ArrayList<Item>();

    public ArrayList<Item> info(){
        info.add(new Item("001","수호의 엑시안","uw","클라우스","기사"));
        info.add(new Item("002","변하지 않는 마음 에레쿠라","uw","제인","기사"));
        info.add(new Item("003","용의 잔해 어테인","uw","필롭","기사"));
        info.add(new Item("004","푸른 빛의 아르페우스","uw","데미아","기사"));
        info.add(new Item("005","승리의 불길 카프레인","uw","모라","기사"));
        info.add(new Item("006","심판의 빛 테오리아","uw","리카르도","기사"));
        info.add(new Item("007","폭풍의 눈, 야나디스","uw","소니아","기사"));


        return info;
    }

}
