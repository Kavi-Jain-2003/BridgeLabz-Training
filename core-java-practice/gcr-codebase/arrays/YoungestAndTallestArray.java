//Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights

//importing scanner class
import java.util.Scanner;

public class YoungestAndTallestArray {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		//creating array
		int[] ages = new int[3];
		int[] heights = new int[3];
		// user input
		System.out.println("Enter 3 ages:");
		for (int i = 0; i < 3; i++) {
			ages[i] = input.nextInt();
		}
		System.out.println("Enter 3 heights:");
		for (int i = 0; i < 3; i++) {
			heights[i] = input.nextInt();
		}
		int youngest = ages[0];
		int tallest = heights[0];
		// to find youngest i.e min
		for (int i = 0; i < 3; i++) {
			if (ages[i] <= youngest) {
				youngest = ages[i];
			}
		}
		// to find tallest i.e max
		for (int i = 0; i < 3; i++) {
			if (heights[i] >= tallest) {
				tallest = heights[i];
			}
		}

		// output
		System.out.println("youngest among 3 friends:" + youngest);
		System.out.println("tallest among 3 friends:" + tallest);

		// closing input
		input.close();
	}
}
