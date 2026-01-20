package BankAccountHeirarchy;

// Abstract parent class
abstract class BankAccount {

    private final String accountNumber;
    private final double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // getter for balance
    public double getBalance() {
        return balance;
    }

    // abstract method
    abstract double calculateFee();
}
