//Program to Check Palindrome String Problem Statement: Create a PalindromeChecker class with an attribute text. Add methods to: ● Check if the text is a palindrome. ● Display the result.
// PalindromeChecker class
class PalindromeChecker {
    // Attribute
    String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        // Remove spaces and convert to lowercase for uniformity
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is palindrome");
        } else {
            System.out.println(text + " is not Palindrome");
        }
    }
}

// Main class
public class StringPalindromeChecker {
    public static void main(String[] args) {
        // Create PalindromeChecker objects
        PalindromeChecker pc1 = new PalindromeChecker("A man a plan a canal Panama");
        PalindromeChecker pc2 = new PalindromeChecker("Hello");

        // Display results
        pc1.displayResult();
        pc2.displayResult();
    }
}
