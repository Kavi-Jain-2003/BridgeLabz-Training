//Create a program to print odd and even numbers between 1 to the number entered by the user.

//importing Scanner class for input
import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) 
	{
	    //scanner object
        Scanner input = new Scanner(System.in);
		//user input
       int number=input.nextInt();
	   
	   if(number>=0)
	   {
	       System.out.println("user entered a positive number");
		   for(int i=1; i<=number; i++)
		   {
		       if(i%2==0)
			   {
			       System.out.println("number "+i+" is even");
			   }
				else
				{
				    System.out.println("number "+i+" is odd");
				}		
		    }
		}
		else
		{
		    System.out.println("please enter a positive number");
		}        
        input.close();
    }
}
