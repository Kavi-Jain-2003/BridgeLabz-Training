//Create a program to find the bonus of employees based on their years of service.

//importing Scanner class for input
import java.util.Scanner;

public class BonusOfEmployee {
    public static void main(String[] args) 
	{
	    //scanner object
        Scanner input = new Scanner(System.in);
		//user input
       int salary=input.nextInt();
	   int yearOfService=input.nextInt();
	   int bonusAmount=0;
	   
	   if(yearOfService>=5)
	   {
	      bonusAmount=(salary*5)/100;
		}
		System.out.println("Bonus Amount:"+bonusAmount);
        input.close();
    }
}
