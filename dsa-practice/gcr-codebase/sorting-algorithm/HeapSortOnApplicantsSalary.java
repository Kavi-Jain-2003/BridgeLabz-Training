import java.util.Arrays;

public class HeapSortOnApplicantsSalary {

    // Heap Sort method
    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        //  Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Extract elements one by one
        for (int i = n - 1; i > 0; i--) {

            // Move current root to end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Heapify reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Heapify subtree rooted at index i
    public static void heapify(int[] arr, int n, int i) {

        int largest = i;        // root
        int left = 2 * i + 1;   // left child
        int right = 2 * i + 2;  // right child

        // If left child is larger
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // If right child is larger
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify affected subtree
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {

        int[] salaryDemands = {60000, 45000, 90000, 30000, 75000};

        heapSort(salaryDemands);

        System.out.println("Sorted Salary Demands:");
        System.out.println(Arrays.toString(salaryDemands));
    }
}
