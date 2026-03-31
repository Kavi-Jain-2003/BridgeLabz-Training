//Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array

//importing scanner class
import java.util.Scanner;

public class TwoDArrayToOneDArray {
	public static void main(String[] args) {
		// creating scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("enter rows:");
		int rows=input.nextInt();
		System.out.println("enter columns:");
		int columns=input.nextInt();
		//1d aarray
		int[] array1D=new int[rows*columns];
		//2d array
		int[][] array2D=new int[rows][columns];
		int index=0;
		System.out.println("enter elements for 2D array:");
		for(int i=0; i<rows; i++)
		{
		    for(int j=0; j<columns; j++)
			{
			    array2D[i][j]=input.nextInt();
			}
		}
		// Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array1D[index] = array2D[i][j];
                index++;
            }
        }

        // Display 1D array
        System.out.println("1D Array elements:");
        for (int i = 0; i < array1D.length; i++) {
            System.out.print(array1D[i] + " ");
        }
		// closing input
		input.close();
	}
}
