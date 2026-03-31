//Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it

//importing Scanner class
import java.util.Scanner;

public class YoungestAndTallestMethod {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		 // Names of friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking user input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ":");
            ages[i] = input.nextInt();

            System.out.println("Enter height of " + names[i] + ":");
            heights[i] = input.nextDouble();
        }
 // Method calls
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        // Display results
        System.out.println("\nYoungest friend is " + names[youngestIndex] +
                " with age " + ages[youngestIndex]);

        System.out.println("Tallest friend is " + names[tallestIndex] +
                " with height " + heights[tallestIndex]);
		// closing input
		input.close();
	}

	// Method to find youngest friend
    public static int findYoungest(int[] ages) {

        int minIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Method to find tallest friend
    public static int findTallest(double[] heights) {

        int maxIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}