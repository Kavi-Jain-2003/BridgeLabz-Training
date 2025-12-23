//Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch

//importing Scanner class for input
import java.util.Scanner;
public class RocketLaunch
{
    public static void main(String[] args)
	{
		//creating scanner object
	    Scanner input=new Scanner(System.in);
		
	    int counter=input.nextInt();
		//while loop to decrement counter upto 1
		while(counter>=1)
		{
		    System.out.println(counter);
			counter--;		
		}
		//close the input
		input.close();
	}
}