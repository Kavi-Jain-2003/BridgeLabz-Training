import java.util.*;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 3};
        int target = 10;

        if (hasPairWithSum(arr, target)) {
            System.out.println("Pair exists with sum " + target);
        } else {
            System.out.println("No pair exists with sum " + target);
        }
    }

    public static boolean hasPairWithSum(int[] arr, int target) {
        // HashMap to store numbers we have seen
        Map<Integer, Boolean> map = new HashMap<>();

        for (int num : arr) {
            int complement = target - num; // The number we need to reach target

            // Check if complement is already in map
            if (map.containsKey(complement)) {
                System.out.println("Pair found: (" + num + ", " + complement + ")");
                return true;
            }

            // Mark current number as seen
            map.put(num, true);
        }

        return false; // No pair found
    }
}
