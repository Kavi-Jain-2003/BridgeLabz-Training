//Create a program to print the greatest factor of a number beside itself using a while loop.

//importing Scanner class for input
import java.util.Scanner;

public class GreatestFactorUsingWhile {
    public static void main(String[] args) 
	{
	    //scanner object
        Scanner input = new Scanner(System.in);
		//user input
		int number=input.nextInt();
		// Initialize greatestFactor
        int greatestFactor = 1;

        // while loop from number-1 to 1
		int counter=number-1;
        while(counter >= 1) {

            // Check perfect divisibility
            if (number % counter == 0) {
                greatestFactor = counter;
                // exit loop after first greatest factor
				break;   
            }
			counter--;
        }

        // Display the result
        System.out.println("Greatest factor (beside itself) = " + greatestFactor);
		
		//closing the input
        input.close();
		
    }
}