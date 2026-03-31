import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};

        int length = longestConsecutive(arr);
        System.out.println("Length of the longest consecutive sequence is: " + length);
    }

    public static int longestConsecutive(int[] arr) {
        // Use a HashSet to store all elements
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;

        for (int num : arr) {
            // Only start counting if num-1 is not in set (start of a sequence)
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                // Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                // Update longest sequence found
                longest = Math.max(longest, currentLength);
            }
        }

        return longest;
    }
}
