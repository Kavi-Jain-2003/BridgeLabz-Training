//Create a program to find all the multiples of a number taken as user input below 100 using while

//importing Scanner class for input
import java.util.Scanner;

public class MultiplesOfANumberUsingWhile {
    public static void main(String[] args) 
	{
	    //scanner object
        Scanner input = new Scanner(System.in);
		//user input
		int number=input.nextInt();
		//if statement to check for positive number greater than 100
		if(number>=0&&number<100)
		{
		    System.out.println("you entered a positive number less than 100");
			int counter=100;
			//loop to find the multiples of number below 100
			 while(counter>= 1) {

                // check if i is a multiple of number
                if (counter% number == 0) {
                    System.out.println(counter);
                }
				counter--;
            }
		}
		else
		{
		    System.out.println("invalid no.");
		}
		
		//closing the input
        input.close();
		
    }
}