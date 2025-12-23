//Create a program to find the bonus of employees based on their years of service.

//importing Scanner class for input
import java.util.Scanner;

public class BonusOfEmployee {
    public static void main(String[] args) 
	{
	    //scanner object
        Scanner input = new Scanner(System.in);
		//user input
		System.out.println("Enter salary:");
       int salary=input.nextInt();
	   System.out.println("Enter yearOfService:");
	   int yearOfService=input.nextInt();
	   int bonusAmount=0;
	   //checking for yearOfService gretaer than 5 and calculating bonus accordingly
	   if(yearOfService>=5)
	   {
	      bonusAmount=(salary*5)/100;
		}
		//displaying output
		System.out.println("Bonus Amount:"+bonusAmount);
		//closing input
        input.close();
    }
}
