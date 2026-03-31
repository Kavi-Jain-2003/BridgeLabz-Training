//Write a program to find the factors of a number and perform various tasks using the factors array

//importing scanner class
import java.util.Scanner;

public class FactorsArrayMethod {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=input.nextInt();		

        // Get factors
        int[] factors = findFactors(number);

        // Display factors
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Greatest factor
        System.out.println("Greatest factor: " + findGreatestFactor(factors));

        // Sum of factors
        System.out.println("Sum of factors: " + sumOfFactors(factors));

        // Product of factors
        System.out.println("Product of factors: " + productOfFactors(factors));

        // Product of cubes of factors
        System.out.println("Product of cubes of factors: " + productOfCubes(factors));
		//closing input
		input.close();
	}
	 // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {      
		int count=0;
		for(int i=1; i<=number; i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}
		// Create array to store factors
		int[] factors=new int[count];
		int index=0;
		for(int i=0; i<=number; i++)
		{
			if(number%i==0)
			{
				factors[index]=i;
			}
			index++;
		}
		return factors;
    }
	  // Method to find the greatest factor using factors array
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1]; // last element is greatest
    }
	// Method to find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
	// Method to find the product of the factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
	 // Method to find the product of the cube of the factors
    public static long productOfCubes(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
}