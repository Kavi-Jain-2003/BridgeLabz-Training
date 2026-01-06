
//InvoiceGenerator for freelancers
//importing Scanner class
import java.util.Scanner;

public class InvoiceGenerator {
    // custom exception
    static class InvalidInvoiceFormatException extends Exception {
        public InvalidInvoiceFormatException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        // Scanner object
        Scanner sc = new Scanner(System.in);
        // user input
        System.out.println("Enter tasks and payment in INR like this (Logo Design - 3000 INR, Web Page - 4500 INR):");
        String input = sc.nextLine();
//try-catch block
        try {
            String task[] = parseInvoice(input);
            for (String t : task) {
                System.out.println(t);
            }
            int totalAmount = getTotalAmount(task);
            System.out.println("Total invoice amount:" + totalAmount);
        } catch (InvalidInvoiceFormatException ex) {
            System.out.println("Error:" + ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println("Invalid invoic error");
        }
        //closing input
        sc.close();
    }
//parse input to extract price
    public static String[] parseInvoice(String input) throws InvalidInvoiceFormatException {
        String[] task = input.split(",");
        for (int i = 0; i < task.length; i++) {
            task[i] = task[i].trim();
            if (!task[i].contains(" - ") || !task[i].trim().endsWith("INR")) {
                throw new InvalidInvoiceFormatException("invalid format");
            }
        }
        return task;
    }
//getting total amount 
    public static int getTotalAmount(String[] task) {
        int total = 0;
        for (String t : task) {
            String[] parts = t.split(" - ");
            String pricePart = parts[1].replace("INR", "").trim();
            total += Integer.parseInt(pricePart);
        }
        return total;

    }
}