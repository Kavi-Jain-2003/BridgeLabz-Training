//Create a program to find the mean height of players present in a football team.


//importing scanner class
import java.util.Scanner;

public class MeanHeight {
	public static void main(String[] args) {
		// creating scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("enter 11 array elements:");
		// creating array
		double[] playersHeight = new double[11];
		//inserting elements to array
		for(int i=1; i<=11; i++)
		{
		    playersHeight[i-1]=input.nextDouble();
		}
		double total=0.0;
		double meanHeight=0.0;
		//calculating sum
		for(int i=1; i<=11; i++)
		{
		    total+=playersHeight[i-1];
		}
		//calculating mean
		meanHeight=total/11;
		//display output
		System.out.println("Mean height of the players:"+meanHeight);
		// closing input
		input.close();
	}
}
