//Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights

//importing Scanner class for input
import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) 
	{
	    //scanner object
        Scanner input = new Scanner(System.in);
		//user input
		int age1=input.nextInt();
		int age2=input.nextInt();
		int age3=input.nextInt();
		int height1=input.nextInt();
		int height2=input.nextInt();
		int height3=input.nextInt();
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
		
        input.close();
    }
}