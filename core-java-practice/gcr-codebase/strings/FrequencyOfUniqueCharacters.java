//Write a program to find the frequency of characters in a string using the charAt() method and display the result

//importing scanner class
import java.util.Scanner;
public class FrequencyOfUniqueCharacters
{
	public static void main(String[] args)
	{
	//scanner object
	Scanner input=new Scanner(System.in);
	//user input
	System.out.println("enter a string:");
	String text=input.nextLine();
	 // Find unique characters
        int length = findLength(text);
		char[] uniqueChars = findUniqueCharacters(text, length);


        // Find frequency using unique characters
        String[][] result = findFrequency(text, uniqueChars);

        // Display output
        System.out.println("\nCharacter  Frequency");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "          " + result[i][1]);
        }

	//closing input
	input.close();
	}
	// Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // end of string
        }
        return count;
    }
	//finding unique characters
	public static char[] findUniqueCharacters(String text,int length)
	{
		char[] temp=new char[length];
		int uniqueCount=0;
		for(int i=0; i<length; i++)
		{
			char currentChar=text.charAt(i);
			boolean isUnique=true;
			for(int  j=0; j<i; j++)
			{
				if(currentChar==text.charAt(j))
				{
					isUnique=false;
					break;
				}			
			}
			if(isUnique)
			{
				temp[uniqueCount]=currentChar;
				uniqueCount++;
			}
		}
		//create exact-sized array
		char[] uniqueChars=new char[uniqueCount];
		for(int i=0; i<uniqueCount; i++)
		{
			uniqueChars[i]=temp[i];
		}
		return uniqueChars;
	}
	// Method to find frequency of characters using charAt()
    public static String[][] findFrequency(String text,char[] uniqueChars) {

        int[] frequency = new int[256]; // ASCII characters

        // Count frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }
		

       // Create 2D String array
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return result;		
	}	
}


