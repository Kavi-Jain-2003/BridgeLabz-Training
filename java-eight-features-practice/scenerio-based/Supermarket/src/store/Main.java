package store;

import java.util.*;

public class Main {
	static List<Product> pList = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] input=new String[n];
		for(int i=0; i<n; i++)
		{
			input[i]=sc.nextLine();
		}
		for(int i=0; i<n; i++)
		{
			String[] split=input[i].split(",\\s*");
			String name=split[1];
			double price=Double.parseDouble(split[2]);
			int quantity=Integer.parseInt(split[3]);
			if(split[0].equals("Electronics"))
			{
				int warranty=Integer.parseInt(split[4]);
				Electronics e=new Electronics(name,price,quantity,warranty);
				pList.add(e);
				System.out.println("product added to inventory:"+e.getName());
			}
			else if(split[0].equals("Clothing"))
			{
				String size=split[4];
				Clothing c=new Clothing(name,price,quantity,size);
				pList.add(c);
				System.out.println("product added to inventory:"+c.getName());
			}		
		}
		System.out.println("Inventory:");
		double total=0;
			for(Product p:pList)
			{
				System.out.println(p);
				total+=p.getTotal();
			}
		System.out.println("Total value of inventory:"+total);
		sc.close();

	}
}
