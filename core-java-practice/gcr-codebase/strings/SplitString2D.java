//Write a program to split the text into words and return the words along with their lengths in a 2D array

//importing scanner class
import java.util.Scanner;

public class SplitString2D {
	public static void main(String[] args) {
		// creating Scanner object
		Scanner input = new Scanner(System.in);
		// user input
		System.out.println("enter a string:");
		String text = input.nextLine();
		String[] words = splitWords(text);
        String[][] wordLengthArray = createWordLengthArray(words);

        // Display result
        System.out.println("\nWord\tLength");
        for (int i = 0; i < wordLengthArray.length; i++) {
            System.out.println(wordLengthArray[i][0] + "\t" + wordLengthArray[i][1]);

        }

		// closing input
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

	// Method to split text into words using charAt()
    public static String[] splitWords(String text) {
        int wordCount = 0;
        boolean inWord = false;

        // Count words
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (text.charAt(i) == ' ') {
                inWord = false;
            }
        }
		
        String[] words = new String[wordCount];
        String word = "";
        int index = 0;

        // Extract words
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) != ' ') {
                word = word + text.charAt(i);
            } else if (!word.equals("")) {
                words[index++] = word;
                word = "";
            }
        }

        if (!word.equals("")) {
            words[index] = word;
        }

        return words;
    }
	// Method to create 2D array of word and length
    public static String[][] createWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }
	//comparing splitted strings
	public static boolean compareSplittedStrings(String[] a, String[] b) {
    if (a.length != b.length) {
        return false;
    }
    for (int i = 0; i < a.length; i++) {
        if (!a[i].equals(b[i])) {   
            return false;
        }
    }
    return true;
}
}
