package exercise16StaticChallenge;

public class Item {

    static int numItems = 0;
    final int ID;

    Item(final int id){
        ID = id;
    }

    public static int getNextId(){
        ++numItems;
        return numItems;
    }

    public static Item getItem(){
        int id = Item.getNextId();
        return new Item(id);
    }

    public static void printNumItems(){
        System.out.println(numItems);
    }

    public void printId(){
        System.out.println(ID);
    }
}
