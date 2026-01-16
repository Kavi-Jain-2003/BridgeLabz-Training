import java.util.Arrays;
public class BubbleSortOnMarks {
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    // Swap marks[j] and marks[j+1]
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Optimization: Stop if no swaps occurred
        }
    }

    public static void main(String[] args) {
        int[] marks = {59, 73, 88, 84, 92};
        bubbleSort(marks);
        System.out.println(Arrays.toString(marks));
    }
}

