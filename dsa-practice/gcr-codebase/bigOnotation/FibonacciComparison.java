import java.util.Scanner;

public class FibonacciComparison {

    // Recursive Fibonacci
    public static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci
    public static int fibonacciIterative(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1, sum = 0;

        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fibonacci number (N): ");
        int n = sc.nextInt();

        // Recursive Time
        long startRecursive = System.nanoTime();
        int recResult = fibonacciRecursive(n);
        long endRecursive = System.nanoTime();
        long fiboRecursiveTime = endRecursive - startRecursive;

        // Iterative Time
        long startIterative = System.nanoTime();
        int itrResult = fibonacciIterative(n);
        long endIterative = System.nanoTime();
        long fiboIterativeTime = endIterative - startIterative;

        // Results
        System.out.println("\n--- Fibonacci Comparison ---");

        System.out.println("Fibonacci Number (N): " + n);

        System.out.println("\nRecursive Result : " + recResult);
        System.out.println("Recursive Time   : "
                + fiboRecursiveTime + " ns");

        System.out.println("\nIterative Result : " + itrResult);
        System.out.println("Iterative Time   : "
                + fiboIterativeTime + " ns");
        if (fiboRecursiveTime < fiboIterativeTime)

        {
            System.out.println("fibonacci via recursion takes less time");
        } else {
            System.out.println("fibonacci via recursion takes less time");
        }
        sc.close();

    }
}
