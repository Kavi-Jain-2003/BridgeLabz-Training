public class PeakElementBinarySearch {

    // Function to find a peak element
    public static int findPeak(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check left and right neighbors safely
            boolean leftIsSmaller = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightIsSmaller = (mid == n - 1) || (arr[mid] > arr[mid + 1]);

            if (leftIsSmaller && rightIsSmaller) {
                return arr[mid]; // Found a peak
            } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1; // Move left
            } else {
                left = mid + 1; // Move right
            }
        }

        return -1; // Just in case, though a peak always exists
    }

    // Main method to test
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peak = findPeak(arr);
        System.out.println("A peak element is: " + peak);
    }
}
