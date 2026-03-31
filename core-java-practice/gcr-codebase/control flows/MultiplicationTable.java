//eate a program to find the multiplication table of a number entered by the user from 6 to 9.

//importing Scanner class for input
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) 
	{
	    //scanner object
        Scanner input = new Scanner(System.in);
		//user input
		System.out.println("please enter a number from 6 to 9");
       int number=input.nextInt();
	   //calculting multiplication table
	   if(number>=6 && number<=9)
	   {
	      for(int i=1; i<=10; i++)
		  {
		      System.out.println(number+"*"+i+"="+number*i);
		   }
		}
		else
		{
		    System.out.println("incorrect number");
		}
		//closing input
        input.close();
    }
}
