//Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights

//importing Scanner class for input
import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) 
	{
	    //scanner object
        Scanner input = new Scanner(System.in);
		//user input
		System.out.println("Enter age1:");
		int age1=input.nextInt();
		System.out.println("Enter age2:");
		int age2=input.nextInt();
		System.out.println("Enter age3:");
		int age3=input.nextInt();
		System.out.println("Enter height1:");
		int height1=input.nextInt();
		System.out.println("Enter height2:");
		int height2=input.nextInt();
		System.out.println("Enter height3:");
		int height3=input.nextInt();
		//finding youngest
		if(age1<age2 && age1<age3)
		{
		    System.out.println("friend1 is youngest");
		}
		else if(age2<age1 && age2<age3)
		{
		    System.out.println("friend2 is youngest");
		}
		else
		{
		    System.out.println("friend3 is youngest");
		}
		//finding tallest
		if(height1>height2 && height1>height3)
		{
		    System.out.println("friend1 is tallest");
		}
		else if(height2>height1 && height2>height3)
		{
		    System.out.println("friend2 is tallest");
		}
		else
		{
		    System.out.println("friend3 is tallest");
		}
		//closing input
        input.close();
    }
}