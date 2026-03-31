import java.util.*;

public class NameUppercasing {
    public static void main(String[] args) {

        List<String> employeeNames = Arrays.asList("Alice", "Bob", "Charlie", "Diana");

        System.out.println("Original Names:");
        employeeNames.forEach(System.out::println);

        System.out.println("\nNames in Uppercase for HR Letter:");

        // Using method reference to convert to uppercase
        employeeNames.stream()
                     .map(String::toUpperCase)   // Converts each name to uppercase
                     .forEach(System.out::println); // Prints each uppercase name
    }
}
