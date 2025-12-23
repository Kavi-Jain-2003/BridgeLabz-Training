//Create a program to check if a number taken from the user is a Harshad Number.

import java.util.Scanner;

public class HarshadNumber {

   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value for number
	  int number=input.nextInt();
	  int sum=0;
	  int originalNumber=number;
	  while (number != 0) {
         // Use number % 10 to find each digit of number from last
         int digit = number % 10;

         // add each digit to sum
         sum += digit;

         // Remove last digit from number essentially get the quotient
         number = number / 10;
      }
	  if(originalNumber%sum==0)
	  {
	      System.out.println(originalNumber+" is a harshad Number");
	  }
	  else
	  {
	      System.out.println(originalNumber+" is a harshad Number");
	   }


      //close input
      input.close();
   }
}

