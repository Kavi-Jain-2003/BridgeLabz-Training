/*Scenario Based Problem
Strings – Sentence Formatter
1. Scenario: A text editing tool receives poorly formatted input from users. Your task is to auto-correct formatting by fixing spacing and capitalizing the first letter of each sentence. */
//importing scanner class
import java.util.Scanner;

class SentenceFormatter {
    public static void main(String[] args) {
        // scanner object
        Scanner input = new Scanner(System.in);
        // user input
        System.out.println("Enter a paragraph:");
        String para = input.nextLine();
        String formattedPara = textFormatter(para);
        System.out.println("Formatted para:" + formattedPara);
        // closing input
        input.close();
    }

    public static String textFormatter(String para) {
        para = para.trim().replaceAll("\\s+", " "); // remove extra spaces
        String result = "";
        boolean capitalizeNext = true;

        for (int i = 0; i < para.length(); i++) {
            char ch = para.charAt(i);
            // capitalize first letter of sentence
            if (capitalizeNext && Character.isLetter(ch)) {
                result += Character.toUpperCase(ch);
                capitalizeNext = false;
            } else {
                result += ch;
            }
            // After punctuation, add space and capitalize next letter
            if (ch == '.' || ch == '?' || ch == '!') {
                result += " ";
                capitalizeNext = true;
            }

        }

        return result.trim();
    }

}
