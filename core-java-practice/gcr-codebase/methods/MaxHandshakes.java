//Create a program to find the maximum number of handshakes among students.

//importing Scanner class
import java.util.Scanner;

public class MaxHandshakes {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);		
        // User input
        System.out.println("Enter number of students:");
        int numberOfStudents = input.nextInt();
		
		double maxNoOfhandshakes=maxHandshakesOfStudents(numberOfStudents);
		System.out.println("the number of possible handshakes:"+maxNoOfhandshakes);
        
		// closing input
		input.close();
	}

	//calculating maxNoOfhandshakes
	public static double maxHandshakesOfStudents(int n)
	{
		double handshakes=(n*(n-1))/2;
		return handshakes;
	}
}