// Utility class for mathematical operations
class Utility {

    // Factorial
    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers.");
            return -1;
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Check if number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Find GCD
    public static int gcd(int a, int b) {
        if (a < 0) a = -a;
        if (b < 0) b = -b;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //Fibonacci
    public static int fibonacci(int n) {
        if (n < 0) {
            System.out.println("Fibonacci not defined for negative numbers.");
            return -1;
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}

// Main class to test methods
public class MathematicalOperations {

    public static void main(String[] args) {

        System.out.println("Factorial of 5: " + Utility.factorial(5));
        System.out.println("Factorial of 0: " + Utility.factorial(0));
        System.out.println("Factorial of -3: " + Utility.factorial(-3));

        System.out.println("Is 7 prime? " + Utility.isPrime(7));
        System.out.println("Is 1 prime? " + Utility.isPrime(1));
        System.out.println("Is -5 prime? " + Utility.isPrime(-5));

        System.out.println("GCD of 12 and 18: " + Utility.gcd(12, 18));
        System.out.println("GCD of -10 and 20: " + Utility.gcd(-10, 20));

        System.out.println("Fibonacci of 6: " + Utility.fibonacci(6));
        System.out.println("Fibonacci of 0: " + Utility.fibonacci(0));
        System.out.println("Fibonacci of -4: " + Utility.fibonacci(-4));
    }
}
