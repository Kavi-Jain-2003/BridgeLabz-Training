import java.util.*;
class Product
{
	String name;
	double price;
	double rating;
	double discount;
	Product(String name,double price, double rating, double discount)
	{
		this.name=name;
		this.price=price;
		this.rating=rating;
		this.discount=discount;
	}
	@Override
	public String toString()
	{
		return "Name:"+name+"| Price:"+price+"| Rating:"+rating+" |Discount:"+discount+"%";
	}
	
}
public class EcommerceSorting {
	public static void main(String[] args)
	{
		List<Product> list=new ArrayList<>();
		
		   list.add(new Product("Laptop", 50000, 4.5, 10));
	       list.add(new Product("Smartphone", 20000, 4.7, 5));
	       list.add(new Product("Headphones", 2000, 4.3, 20));
	       list.add(new Product("Smartwatch", 8000, 4.6, 15));
	       
	      System.out.println("Original List:");
	      list.forEach(System.out::println);
	      
	      System.out.println("\nSorted by ratings:");
	      list.sort((p1,p2)->Double.compare(p1.rating,p2.rating));
	      list.forEach(System.out::println);
	      
	      System.out.println("\nSorted by Discount:");
	      list.sort((p1,p2)->Double.compare(p1.discount,p2.discount));
	      list.forEach(System.out::println);
	      
	      

		
	}
}
