//Number Guessing Game:Write a Java program where the user thinks of a number between 1 and 100, and the computer tries to guess the number by generating random guesses.
//importing Scanner class
import java.util.Scanner;
public class NumberGuessingGame
{
	public static void main(String[] args)
	{
		//scanner object
		Scanner input=new Scanner(System.in);
		//user input
		System.out.println("enter a number between 1 and 100:");
		int number=input.nextInt();
		//computer guess
		int computerGuess=(int)(Math.random()*100)+1;
		System.out.println("computer guess:"+computerGuess);
		//comparison
		if(number<computerGuess)
		{
			System.out.println("computer guesses high than number");
		}
		else if(number>computerGuess)
		{
			System.out.println("computer guesses low than number");
		}
		else
		{
			System.out.println("computer guessed correctly");			
		}
		
		//closing input
		input.close();
	}
}