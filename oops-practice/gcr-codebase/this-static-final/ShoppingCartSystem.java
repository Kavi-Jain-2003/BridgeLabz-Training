//Create a Product class to manage shopping cart items with the following features:
 class Product {
    //attributes
    String productName;
    double price;
    int quantity;
    
    //static variable
    static double discount=10.0;
    //final variable
     final String productId;
     //parametrized constructor
    Product( String productId,String productName,double price,int quantity)
    {
        this.productName=productName;
        this.price=price;
        this.productId=productId;
        this.quantity=quantity;
    }
     // static method
     void calcDiscount() {
        double discountedPrice=price-(price*discount/100);
        System.out.println("Price after discount:"+ discountedPrice);
    }
    void priceAfterDiscount()
    {
        
    }
    //instance method with instanceof check
    public void displayProductdetails()
    {
        if(this instanceof Product)
        {
            System.out.println("productId:"+productId);
            System.out.println("productName:"+productName);
            System.out.println("price:"+price);            
            System.out.println("Discount:"+discount+"%");
            System.out.println();
        }
    }
}
public class ShoppingCartSystem
{
    public static void main(String[] args) {
        
        Product p1=new Product("P001","Laptop",1200,5);
       Product p2=new Product("P002","Smartphone",800,10);
        p1.displayProductdetails();
        p1.calcDiscount();
        p2.displayProductdetails();
        p2.calcDiscount();
       
    }
}
