// Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price

//importing Scanner class
import java.util.Scanner;
public class ItemPriceAndQuantity
{
    public static void main(String[] args)
	{
		//creating scanner object
	    Scanner input=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter itemPrice:");
	    double itemPrice=input.nextInt();
		System.out.println("Enter Quantity:");
		int itemQuantity=input.nextInt();
		//calculating toalPrice
		double totalPrice=itemPrice*itemQuantity;
		//displaying output
		System.out.printf("The total purchase price is INR "+totalPrice+" if the qunatity is "+itemQuantity+" and unit price is INR "+itemPrice);
		//closing input
		input.close();
	}
}

