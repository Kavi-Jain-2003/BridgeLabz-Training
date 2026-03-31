import java.util.Arrays;

public class SelectionSortOnExamScores {

    public static void selectionSort(int[] scores) {

        int n = scores.length;

        // Traverse through all elements
        for (int i = 0; i < n - 1; i++) {

            // Assume the minimum is at index i
            int minIndex = i;

            // Find the minimum element in unsorted part
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] examScores = {78, 45, 89, 32, 67};

        selectionSort(examScores);

        System.out.println("Sorted Exam Scores:");
        System.out.println(Arrays.toString(examScores));
    }
}
