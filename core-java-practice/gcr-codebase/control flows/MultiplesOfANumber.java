//Create a program to find all the multiples of a number taken as user input below 100

//importing Scanner class for input
import java.util.Scanner;

public class MultiplesOfANumber {
    public static void main(String[] args) 
	{
	    //scanner object
        Scanner input = new Scanner(System.in);
		//user input
		int number=input.nextInt();
		// check for positive number less than 100
        if (number > 0 && number < 100) {
            System.out.println("You entered a positive number less than 100");

            // backward loop from 100 to 1
            for (int i = 100; i >= 1; i--) {

                // check if i is a multiple of number
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Invalid number");
        }

		//closing the input
        input.close();
		
    }
}