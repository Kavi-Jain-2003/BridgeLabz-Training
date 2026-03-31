import java.util.Arrays;

public class LinearBinarySearchChallenge {

    // Part 1: Find first missing positive using linear search (index marking)
    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;

        // Step 1: Replace negatives and numbers > n with a placeholder (n+1)
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] > n) {
                arr[i] = n + 1;
            }
        }

        // Step 2: Mark presence by negating value at index (if within 1..n)
        for (int i = 0; i < n; i++) {
            int num = Math.abs(arr[i]);
            if (num <= n) {
                arr[num - 1] = -Math.abs(arr[num - 1]);
            }
        }

        // Step 3: First positive index is the missing number
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }

        return n + 1; // If all numbers 1..n are present
    }

    // Part 2: Binary search to find index of target
    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr); // Sort array first
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Found target
            } else if (arr[mid] < target) {
                left = mid + 1; // Search right
            } else {
                right = mid - 1; // Search left
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int target = 4;

        // Linear Search for first missing positive
        int missing = firstMissingPositive(arr.clone()); // Use clone to preserve original for binary search
        System.out.println("First missing positive: " + missing);

        // Binary Search for target index
        int index = binarySearch(arr.clone(), target);
        System.out.println("Index of target " + target + ": " + index);
    }
}
