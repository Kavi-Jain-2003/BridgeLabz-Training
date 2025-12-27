//Write a program to split the text into words and find the shortest and longest strings in a given text

//importing scanner class
import java.util.Scanner;

public class ShortestLongestWord {
	public static void main(String[] args) {
		// creating Scanner object
		Scanner input = new Scanner(System.in);
		// user input
		System.out.println("enter a string:");
		String text = input.nextLine();
		//method calls
		String[] words = splitWords(text);
        String[][] wordLengthArray = createWordLengthArray(words);
        int[] result = findShortestAndLongest(wordLengthArray);

        // Display result
        System.out.println("\nWords and Lengths:");
        for (int i = 0; i < wordLengthArray.length; i++) {
            System.out.println(wordLengthArray[i][0] + " -> " + wordLengthArray[i][1]);
        }

        System.out.println("\nShortest word length: " + result[0]);
        System.out.println("Longest word length : " + result[1]);
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
	// Method to find shortest and longest string lengths
    public static int[] findShortestAndLongest(String[][] wordLengthArray) {
        int shortest = Integer.parseInt(wordLengthArray[0][1]);
        int longest = Integer.parseInt(wordLengthArray[0][1]);

        for (int i = 1; i < wordLengthArray.length; i++) {
            int len = Integer.parseInt(wordLengthArray[i][1]);

            if (len < shortest) {
                shortest = len;
            }
            if (len > longest) {
                longest = len;
            }
        }

        return new int[]{shortest, longest};
    }
}