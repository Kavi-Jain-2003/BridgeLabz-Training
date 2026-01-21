interface BookCategory{}
interface ClothingCategory{}
interface GadgetCategory{}


abstract class Product<T>
{
    private double price;
    private String name;
    private T category;
    public Product(String name,double price,T category)
    {
        this.price=price;
        this.name=name;
        this.category=category;
    }
    public double getPrice()
    {
        return price;
    }
    public String getName()
    {
        return name;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public abstract String getProductType();

}
class Book extends Product<BookCategory>
{
    public Book(String name, double price, BookCategory category)
    {
        super(name,price,category);
    }
    @Override
    public String getProductType()
    {
        return "Book";
    }
}
class Clothing extends Product<ClothingCategory>
{
    public Clothing(String name, double price,ClothingCategory category)
    {
        super(name,price,category);
    }
    @Override
    public String getProductType()
    {
        return "Clothing";
    }
}
class Gadget extends Product<GadgetCategory>
{
    public Gadget(String name,double price, GadgetCategory category)
    {
        super(name,price,category);
    }
    @Override
    public String getProductType()
    {
        return "Gadgets";
    }
}
class DiscountUtil
{
    public static <T extends Product<?>> void applyDiscount(T product, double percentage)
    {   
        double discount=product.getPrice()*(percentage/100);
        double newPrice=product.getPrice()-discount;
        product.setPrice(newPrice);
        System.out.println(product.getProductType()+product.getName()+" discounted price:"+newPrice);

    }
}
public class DynamicOnlineMarketPlace {
    public static void main(String[] args) {
        BookCategory fiction=new BookCategory(){};
        ClothingCategory casual=new ClothingCategory(){};
        GadgetCategory electronics=new GadgetCategory(){};

        Book book=new Book("Java programming",500,fiction);
        Clothing shirt=new Clothing("T-shirt",800,casual);
        Gadget phone=new Gadget("smartphone",20000,electronics);

        DiscountUtil.applyDiscount(book,10);
        DiscountUtil.applyDiscount(shirt,20);
        DiscountUtil.applyDiscount(phone,5);
    }    
}









