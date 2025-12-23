// Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price

import java.util.Scanner;
public class ItemPriceAndQuantity
{
    public static void main(String[] args)
	{
	    Scanner input=new Scanner(System.in);
	    double itemPrice=input.nextInt();
		int itemQuantity=input.nextInt();
		double totalPrice=itemPrice*itemQuantity;
		System.out.printf("The total purchase price is INR "+totalPrice+" if the qunatity is "+itemQuantity+" and unit price is INR "+itemPrice);
		input.close();
	}
}

