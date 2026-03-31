import java.util.*;

public class AllSubarraysWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, -4, -2, -2};
        findZeroSumSubarrays(arr);
    }

    public static void findZeroSumSubarrays(int[] arr) {
        // Map to store cumulative sum and list of indices where it occurs
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        // Initialize map with sum 0 at index -1
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum is already in map, we found zero-sum subarrays
            if (map.containsKey(sum)) {
                List<Integer> indices = map.get(sum);
                for (int startIndex : indices) {
                    System.out.println("Subarray [" + (startIndex + 1) + " to " + i + "] sums to 0");
                }
            }

            // Add current index to map
            if (!map.containsKey(sum)) {
                map.put(sum, new ArrayList<>());
            }
            map.get(sum).add(i);
        }
    }
}
