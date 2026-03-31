//Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
//importing Scanner clas
import java.util.Scanner;

public class CompareCharArray {
    public static void main(String[] args) {
		// creating scanner object
		Scanner input = new Scanner(System.in);
		// taking input from user
		System.out.println("enter string:");
		String s1 = input.next();
		
		// get characters using user-defined method
        char[] userArray = getCharsUsingCharAt(s1);

        // get characters using built-in method
        char[] methodArray = s1.toCharArray();
		
		 // Method to compare two char arrays
		   // compare both arrays
        boolean result = compareCharArrays(userArray, methodArray);

		 // display result
        if (result) {
            System.out.println("Both character arrays are equal");
        } else {
            System.out.println("Character arrays are not equal");
        }

        // close input
        input.close();
    }

        // Method to return characters using charAt()
    public static char[] getCharsUsingCharAt(String s) {

        char[] arr = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        return arr;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] a1, char[] a2) {

        if (a1.length != a2.length) {
            return false;
        }

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }

        return true;
    }
}