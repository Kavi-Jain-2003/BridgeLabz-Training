//Write a program to find the frequency of characters in a string using the charAt() method and display the result

//importing scanner class
import java.util.Scanner;
public class FrequencyOfCharacters
{
	public static void main(String[] args)
	{
	//scanner object
	Scanner input=new Scanner(System.in);
	//user input
	System.out.println("enter a string:");
	String text=input.nextLine();
	
	int[][] frequency2DArray=findFrequency(text);
	//display output
	for(int i=0; i<frequency2DArray.length; i++)
	{
		System.out.println((char)frequency2DArray[i][0]+"  "+frequency2DArray[i][1]);
	}
	//closing input
	input.close();
	}
	// Method to find frequency of characters using charAt()
    public static int[][] findFrequency(String text) {

        int[] frequency = new int[256]; // ASCII characters

        // Count frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }
		 //Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] != 0) {
                uniqueCount++;
                frequency[text.charAt(i)] = 0; // mark as processed
            }
        }

        //  Create 2D array
        int[][] result = new int[uniqueCount][2];
        int index = 0;

        int[] freqCopy = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freqCopy[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freqCopy[ch] != 0) {
                result[index][0] = ch;
                result[index][1] = freqCopy[ch];
                freqCopy[ch] = 0;
                index++;
            }
        }

        return result;		
	}	
}


