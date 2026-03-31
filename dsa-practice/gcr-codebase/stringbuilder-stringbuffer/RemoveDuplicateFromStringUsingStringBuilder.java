import java.util.HashSet;

public class RemoveDuplicateFromStringUsingStringBuilder {
    public static void main(String[] args) {

        String input = "programming";

        // StringBuilder to store result
        StringBuilder sb = new StringBuilder();

        // HashSet to track characters
        HashSet<Character> set = new HashSet<>();

        // Iterate through string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Add only if not present
            if (!set.contains(ch)) {
                sb.append(ch);
                set.add(ch);
            }
        }

        // Convert to String
        String result = sb.toString();
        System.out.println("String without duplicates: " + result);
    }
}
