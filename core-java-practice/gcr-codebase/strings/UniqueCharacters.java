//Find unique characters in a string using the charAt() method and display the result
//importing scanner class
import java.util.Scanner;
public class UniqueCharacters
{
	public static void main(String[] args)
	{
	//scanner object
	Scanner input=new Scanner(System.in);
	//user input
	System.out.println("enter a string:");
	String text=input.nextLine();
	int length=findLength(text);
	char[] uniqueCharArray=findUniqueCharacters(text,length);
	//display output of unique characters
	for(int i=0; i<uniqueCharArray.length; i++)
	{
		System.out.println(uniqueCharArray[i]+" ");
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
		char[] uniqueCharArray=new char[uniqueCount];
		for(int i=0; i<uniqueCount; i++)
		{
			uniqueCharArray[i]=temp[i];
		}
		return uniqueCharArray;
	}
	
}


