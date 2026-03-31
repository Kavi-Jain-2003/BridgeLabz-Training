import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {

    static void generateBinary(int n) {

        Queue<String> queue = new LinkedList<>();

        // Step 1: add first binary number
        queue.add("1");

        // Step 2: generate n numbers
        for (int i = 1; i <= n; i++) {

            // Remove front
            String current = queue.remove();

            // Print current binary number
            System.out.print(current + " ");

            // Add next two binary numbers
            queue.add(current + "0");
            queue.add(current + "1");
        }
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.print("Binary Numbers: ");
        generateBinary(n);
    }
}
