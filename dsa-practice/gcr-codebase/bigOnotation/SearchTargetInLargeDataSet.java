import java.util.*;

public class SearchTargetInLargeDataSet {

    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int size = 1000;
        int[] arr = new int[size];

        Random random = new Random();

        // Generate 1000 random values (1 to 10000)
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10000) + 1;
        }

        // Generate random target within same range
        //int target = random.nextInt(10000) + 1; OR
        int target = arr[random.nextInt(size)];


        System.out.println("Target value to search: " + target);

        //  Linear Search 
        long startLinear = System.nanoTime();
        int linearIndex = linearSearch(arr, target);
        long endLinear = System.nanoTime();
        long linearSearchTime=endLinear-startLinear;

        //  Binary Search 
        Arrays.sort(arr); 

        long startBinary = System.nanoTime();
        int binaryIndex = binarySearch(arr, target);
        long endBinary = System.nanoTime();
        long binarySearchTime=endBinary-startBinary;

        //  Results 
        System.out.println("\n--- Search Results ---");

        System.out.println("Linear Search Index  : " + linearIndex);
        System.out.println("Linear Search Time   : " + linearSearchTime+ " ns");

        System.out.println("Binary Search Index  : " + binaryIndex);
        System.out.println("Binary Search Time   : " + binarySearchTime+ " ns");
        if(linearSearchTime<binarySearchTime)
        {
            System.out.println("Linear search takes less time in searching");
        }
        else
        {
            System.out.println("Binary search takes less time in searching");
        }
    }
}
