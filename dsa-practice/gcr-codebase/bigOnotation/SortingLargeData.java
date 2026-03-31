import java.util.*;

public class SortingLargeData {

    // ---------------- Bubble Sort ----------------
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // ---------------- Merge Sort ----------------
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    // ---------------- Quick Sort ----------------
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // ---------------- Main ----------------
    public static void main(String[] args) {

        int size = 1000; // change to 10000 or more
        int[] original = new int[size];
        Random random = new Random();

        // Generate random values
        for (int i = 0; i < size; i++) {
            original[i] = random.nextInt(10000);
        }

        // Copies for fair comparison
        int[] arrBubble = original.clone();
        int[] arrMerge = original.clone();
        int[] arrQuick = original.clone();

        // -------- Bubble Sort Time --------
        long startBubble = System.nanoTime();
        bubbleSort(arrBubble);
        long endBubble = System.nanoTime();
        long bubbleSortTime=endBubble-startBubble;

        // -------- Merge Sort Time --------
        long startMerge = System.nanoTime();
        mergeSort(arrMerge, 0, arrMerge.length - 1);
        long endMerge = System.nanoTime();
        long mergeSortTime=endMerge-startMerge;

        // -------- Quick Sort Time --------
        long startQuick = System.nanoTime();
        quickSort(arrQuick, 0, arrQuick.length - 1);
        long endQuick = System.nanoTime();
        long quickSortTime=endQuick-startQuick;

        // -------- Results --------
        System.out.println("--- Sorting Performance Comparison ---");
        System.out.println("Dataset Size : " + size);

        System.out.println("Bubble Sort Time : " + bubbleSortTime + " ns");
        System.out.println("Merge Sort Time  : " + mergeSortTime + " ns");
        System.out.println("Quick Sort Time  : " + quickSortTime + " ns");
        if(bubbleSortTime<mergeSortTime && bubbleSortTime<quickSortTime)
        {
            System.out.println("Bubble sort taks less time");
        }
        else if(mergeSortTime<bubbleSortTime && mergeSortTime<quickSortTime)
        {
            System.out.println("Merge sort taks less time");
        }
        else
        {
            System.out.println("Quick sort taks less time");
        }
    }
}
