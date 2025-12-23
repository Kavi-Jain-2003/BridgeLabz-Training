//Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement

//importing Scanner class for input
import java.util.Scanner;

public class SumOfNumbersUntilZeroOrNegative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // total initialized to 0.0
        double total = 0.0;

        // variable to store user input
        double value;

        while (true) {
		    // take user input
            value = input.nextDouble(); 

            // break if user enters 0 or negative number
            if (value <= 0) {
                break;
            }
			// add to total
            total += value;   
        }

        // display total outside the loop
        System.out.println("Total = " + total);
        input.close();
    }
}
