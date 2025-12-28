//An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete

//importing Scanner class
import java.util.Scanner;

public class RoundsInTriangularPark {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);		
        // User input
        System.out.println("Enter three sides of triangle:");
        int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		double roundsToCover=parkPerimeterAndRounds(a,b,c);
        System.out.println("Rounds to cover 5km distance:"+roundsToCover);
		// closing input
		input.close();
	}

	//triangle perimeter
	public static double parkPerimeterAndRounds(int a,int b, int c)
	{
		int distanceInMeters=5000;
		int perimeter=(a+b+c);
		double rounds=(double)distanceInMeters/perimeter;
		return rounds;
	}
}