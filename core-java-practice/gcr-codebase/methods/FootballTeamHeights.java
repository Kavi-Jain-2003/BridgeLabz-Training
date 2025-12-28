
//Create a program to find the shortest, tallest, and mean height of players present in a football team.
//importing scanner class
import java.util.Scanner;

public class FootballTeamHeights {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		int[] heights = new int[11];
		// Generate random heights between 150 cm and 250 cm
		for (int i = 0; i < heights.length; i++) {
			heights[i] = (int) (Math.random() * 101) + 150;
		}
		// display heights
		System.out.println("Heights of football players (in cm):");
		for (int height : heights) {
			System.out.print(height + " ");
		}
		System.out.println();
		double mean = findMean(heights);
		int shortest = findShortest(heights);
		int tallest = findTallest(heights);

		// Display results
		System.out.println("Shortest height: " + shortest + " cm");
		System.out.println("Tallest height: " + tallest + " cm");
		System.out.println("Mean height: " + mean + " cm");
		//closing input
		input.close();
	}

	// method to find sum of heights
	public static int findSum(int[] heights) {
		int sum = 0;
		for (int height : heights) {
			sum += height;
		}
		return sum;
	}

	// method to find mean height
	public static double findMean(int[] heights) {
		return (double) findSum(heights) / heights.length;
	}

	// method to find shortest height
	public static int findShortest(int[] heights)
	{
		int min=heights[0];
		for(int height:heights)
		{
			if(height<min)
			{
				min=height;
			}
		}
		return min;
	}


	// Method to find tallest height
	public static int findTallest(int[] heights) {
		int max = heights[0];
		for (int height : heights) {
			if (height > max) {
				max = height;
			}
		}
		return max;
	}
}