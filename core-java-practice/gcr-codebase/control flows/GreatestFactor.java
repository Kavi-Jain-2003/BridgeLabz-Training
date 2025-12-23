//Create a program to print the greatest factor of a number beside itself using a loop.

//importing Scanner class for input
import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) 
	{
	    //scanner object
        Scanner input = new Scanner(System.in);
		//user input
		int number=input.nextInt();
		// Initialize greatestFactor
        int greatestFactor = 1;

        // for loop from number-1 to 1
        for (int i = number - 1; i >= 1; i--) {

            // Check perfect divisibility
            if (number % i == 0) {
                greatestFactor = i;
                // exit loop after first greatest factor
				break;   
            }
        }

        // Display the result
        System.out.println("Greatest factor (beside itself) = " + greatestFactor);
		
		//closing the input
        input.close();
		
    }
}