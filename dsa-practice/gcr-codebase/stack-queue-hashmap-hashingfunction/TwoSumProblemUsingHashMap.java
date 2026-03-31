import java.util.*;
public class TwoSumProblemUsingHashMap {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 3};
        int target = 10;

        int[] result = twoSum(arr, target);

        if (result != null) {
            System.out.println("Indices of the two elements: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two elements sum up to the target.");
        }
    }

    public static int[] twoSum(int[] arr, int target) {
        // HashMap to store value -> index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i]; // What we need to find

            // Check if complement exists in map
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            // Store current element and its index in map
            map.put(arr[i], i);
        }

        return null; // No pair found
    }
}
