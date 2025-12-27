//Write a program to convert the complete text to lowercase and compare the results

//importing Scanner clas
import java.util.Scanner;

public class LowerCaseString {
    public static void main(String[] args) {
        // creating scanner object
        Scanner input = new Scanner(System.in);
        // taking input from user
        System.out.println("enter string:");
        String text = input.next();

        // get characters using user-defined method
        String lowerUsingCharAt = convertToLower(text);

        // get characters using built-in method
        String lowerUsingMethod = text.toLowerCase();

        // Method to compare two  string
        // compare both string
        boolean result = compareLowerStrings(lowerUsingCharAt, lowerUsingMethod);

        // display result
        if (result) {
            System.out.println("Both  strings are equal");
        } else {
            System.out.println(" Both strings are not equal");
        }

        // close input
        input.close();
    }

    // Method to return characters using charAt()
    public static String convertToLower(String text) {

        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if lowercase letter
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            } else {
                result += ch;
            }
            }
        return result;
    }

    // Method to compare two char string
    public static boolean compareLowerStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}