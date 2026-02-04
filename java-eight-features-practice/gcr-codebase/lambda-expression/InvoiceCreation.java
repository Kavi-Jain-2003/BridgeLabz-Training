import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    String transactionId;

    // Constructor
    public Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice for Transaction ID: " + transactionId;
    }
}

public class InvoiceCreation {
    public static void main(String[] args) {

        List<String> transactionIds = Arrays.asList("TXN1001", "TXN1002", "TXN1003");

        // Using constructor reference to create Invoice objects
        List<Invoice> invoices = transactionIds.stream()
                                               .map(Invoice::new)  // constructor reference
                                               .collect(Collectors.toList());

        // Print all invoices
        invoices.forEach(System.out::println);
    }
}
