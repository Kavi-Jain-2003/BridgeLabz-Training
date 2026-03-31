import java.util.ArrayList;
import java.util.List;
abstract class WareHouseItem {
    private String name;
    WareHouseItem(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public abstract String getCategory();

}
class Electronics extends WareHouseItem
{
    Electronics(String name)
    {
        super(name);
    }
    @Override
    public String getCategory()
    {
        return "Electronics";
    }
}
class Groceries extends WareHouseItem
{
    Groceries(String name)
    {
        super(name);
    }
    @Override
    public String getCategory()
    {
        return "groceries";
    }
}
class Furniture extends WareHouseItem
{
    Furniture(String name)
    {
        super(name);
    }
    @Override
    public String getCategory()
    {
        return "Furniture";
    }
}
class Storage<T extends WareHouseItem>  //only warehouse items are allowed 
{
    private List<T> items=new ArrayList<>();
    public void addItem(T item)
    {
        items.add(item);
    }
    public List<T> getItems()
    {
        return items;
    }
}
class WarehouseUtil  //reading items of any subclass 
{
    public static void displayItems(List<? extends WareHouseItem> items)
    {
        for(WareHouseItem item:items)
        {
            System.out.println("Item name:"+item.getName()+" category:"+item.getCategory());
        }
    }//only to read items
}
public class SmartWareHouseManagementSystem
{
    public static void main(String[] args) {
        //elctronic storage
        Storage<Electronics> electronicsStorage=new Storage<>();
        electronicsStorage.addItem(new Electronics("laptop"));
        electronicsStorage.addItem(new Electronics("mouse"));
        //furniture storage
        Storage<Furniture> furnitureStorage=new Storage<>();
        furnitureStorage.addItem(new Furniture("table"));
        furnitureStorage.addItem(new Furniture("sofa"));
        //groceries storage
        Storage<Groceries> groceriesStorage=new Storage<>();
        groceriesStorage.addItem(new Groceries("rice"));
        groceriesStorage.addItem(new Groceries("milk"));

         System.out.println("---- Electronics Items ----");
        WarehouseUtil.displayItems(electronicsStorage.getItems());

        System.out.println("\n---- Groceries Items ----");
        WarehouseUtil.displayItems(groceriesStorage.getItems());

        System.out.println("\n---- Furniture Items ----");
        WarehouseUtil.displayItems(furnitureStorage.getItems());
    }

}