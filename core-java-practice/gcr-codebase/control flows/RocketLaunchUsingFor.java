//Write a program to count down the number from the user input value to 1 using a for loop for a rocket launch

//importing Scanner class for input
import java.util.Scanner;
public class RocketLaunchUsingFor
{
    public static void main(String[] args)
	{
		//creating scanner object
	    Scanner input=new Scanner(System.in);
		
	    int counter=input.nextInt();
		//while loop to decrement counter upto 1
		for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
		//close the input
		input.close();
	}
}