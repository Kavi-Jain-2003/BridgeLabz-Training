//Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods

//importing scanner class
import java.util.Scanner;

public class NumberCheckerMethod4 {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=input.nextInt();
		// Prime check
        if (isPrime(number)) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is NOT a Prime Number");
        }

        // Neon check
        if (isNeonNumber(number)) {
            System.out.println(number + " is a Neon Number");
        } else {
            System.out.println(number + " is NOT a Neon Number");
        }

        // Spy check
        if (isSpyNumber(number)) {
            System.out.println(number + " is a Spy Number");
        } else {
            System.out.println(number + " is NOT a Spy Number");
        }

        // Automorphic check
        if (isAutomorphicNumber(number)) {
            System.out.println(number + " is an Automorphic Number");
        } else {
            System.out.println(number + " is NOT an Automorphic Number");
        }

        // Buzz check
        if (isBuzzNumber(number)) {
            System.out.println(number + " is a Buzz Number");
        } else {
            System.out.println(number + " is NOT a Buzz Number");
        }

		//closing input
		input.close();
	}
	 // Method to check Prime Number
	 public static boolean isPrime(int number)
	 {
		 if(number<=1)
		 {
			 return false;
		 }
		 for(int i=2; i<number; i++)
		 {
			 if(number%i==0)
			 {
				 return false;
			 }
		 }
		 return true;
	 }
	  // Method to check Neon Number
    public static boolean isNeonNumber(int number) {
		int square=number*number;
		int sum=0;
		while(square!=0)
		{
			sum+=square%10;
			square/=10;
		}
		return sum==number;
	}
	// Method to check Spy Number
    public static boolean isSpyNumber(int number) {
		int sum=0;
		int product=1;
		int temp=number;
		while(temp!=0)
		{
			int digit=temp%10;
			sum+=digit;
			product*=digit;
			temp/=10;
		}
		return sum==product;
	}
	 // Method to check Automorphic Number
    public static boolean isAutomorphicNumber(int number) {
		int square=number*number;
		int temp=number;
		while(temp!=0)
		{
			if(temp%10!=square%10)
			{
				return false;
			}
			temp/=10;
			square/=10;
		}
		return true;
	}
	 // Method to check Buzz Number
    public static boolean isBuzzNumber(int number) {

        return (number % 7 == 0) || (number % 10 == 7);
    }
}