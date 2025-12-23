//Create a program to count the number of digits in an integer.
import java.util.Scanner;

public class CountNumberOfDigits {

   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value for number
      int number = input.nextInt();
	  int originalNumber=number;
	  //an integer variable count with value 0.
      int count=0;

      // Run while loop to access each digit of number
      while (number != 0) {
         // Use number % 10 to find each digit of number from last
         
		 count++;
         // Remove last digit from number essentially get the quotient
         number = number / 10;
      }

      // Print the count to count the digts of a number 
      System.out.println("The no. of digits in "+originalNumber+" is "+count);
	  //close input
      input.close();
   }
}

