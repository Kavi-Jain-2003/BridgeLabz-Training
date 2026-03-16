package store;

public class Product {
	protected String name;
	protected double price;
	protected int quantity;
	public Product(String name,double price,int quantity)
	{
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getTotal()
	{
		return price*quantity;
	}
	@Override
	public String toString()
	{
		return name+"- Price:"+price+" Quantity:"+quantity; 
	}
}
class Clothing extends Product{
	
	String size;
	Clothing(String name,double price,int quantity,String size)
	{
		super(name,price,quantity);
		this.size=size;
	}
	@Override
	public String toString()
	{
		return name+"- Price:"+price+" Quantity:"+quantity+" Size:"+size; 
	}
}

class Electronics extends Product{
	int warranty;
	Electronics(String name,double price,int quantity,int warranty)
	{
		super(name,price,quantity);
		this.warranty=warranty;
	}
	@Override
	public String toString()
	{
		return name+"- Price:"+price+" Quantity:"+quantity+" Warranty:"+warranty+" months"; 
	}
}

