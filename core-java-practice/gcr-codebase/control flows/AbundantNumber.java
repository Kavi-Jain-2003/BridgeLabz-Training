//Create a program to check if a number is an Abundant Number.
//importing Scanner class
import java.util.Scanner;
public class AbundantNumber {

   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value for number
	  System.out.println("Enter number:");
	  int number=input.nextInt();
	  //initialising variable
	  int sum=0;
	  //loop to find factors of number
	  for(int i=1; i<number; i++)
	  {
	      if(number%i==0)
		  {
		      sum+=i;
           }			  
	  }
	  //to check for abundant number  and display output
	  if(sum>number)
	  {
	      System.out.println(number+" is an Abundant Number");
	  }
	  else
	  {
	      System.out.println(number+" is not an Abundant Number");
	   }


      //close input
      input.close();
   }
}

