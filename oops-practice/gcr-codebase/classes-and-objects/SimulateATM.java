//Program to Simulate an ATM Problem Statement: Create a BankAccount class with attributes accountHolder, accountNumber, and balance. Add methods for: ● Depositing money. ● Withdrawing money (only if sufficient balance exists). ● Displaying the current balance.
// BankAccount class
class BankAccount {
    // Attributes
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor to initialize bank account
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        displayBalance();
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw amount is : " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
        displayBalance();
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}

// Main class
public class SimulateATM {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount("State of Chennai", "ACC001", 700.0);

        // Display initial balance
        account.displayBalance();

        // Deposit money
        account.deposit(200.0);

        // Withdraw money
        account.withdraw(100.0);

        // Attempt to withdraw more than balance
        account.withdraw(1000.0);
    }
}
