//Write a Java program to compare two strings lexicographically (dictionary order) without using built-in compare methods.

//importing Scanner class
import java.util.Scanner;

public class CompareStringsLexicographically {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		 // User input
        System.out.println("Enter first string:");
        String str1 = input.nextLine();

        System.out.println("Enter second string:");
        String str2 = input.nextLine();

        int result = compareStrings(str1, str2);

        if (result == 0) {
            System.out.println("Both strings are equal");
        } else if (result < 0) {
            System.out.println(str1 + " comes before " + str2);
        } else {
            System.out.println(str1 + " comes after " + str2);
        }

		// closing input
		input.close();
	}

	//compare two strings lexicographically
	public static int compareStrings(String s1,String s2) 
	{	
	int i=0;
	//compare characters one by one
		while(i<s1.length()&&i<s2.length())
		{
			char ch1=s1.charAt(i);
			char ch2=s2.charAt(i);
			if(ch1!=ch2)
			{
				return ch1-ch2;
			}
			i++;			
		}
		//if all characters matched
		return s1.length()-s2.length();
		
	}
}
