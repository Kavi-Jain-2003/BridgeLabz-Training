//Create a program to check if a number is armstrong or not. Use the hints to show the steps clearly in the code

//importing Scanner class for input
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) 
	{
	    //scanner object
        Scanner input = new Scanner(System.in);
		//user input
		int number = input.nextInt();
		int sum=0;
		int originalNumber=number;
		//loop till the originalNumber is not equal to zero
		while(originalNumber!=0)
		{
		    int digit=number%10;
			//the cube of the number and add it to the sum variable
			sum=sum+digit*digit*digit;
			//the quotient of the number using the division operation 
			originalNumber=originalNumber/10;			
		}
		if(number==originalNumber)
		{
		    System.out.println(number+" is an armstrong number");
		}
		else
		{
		    System.out.println(number+" is an armstrong number");
		}
        //close the input
        input.close();
		
    }
}