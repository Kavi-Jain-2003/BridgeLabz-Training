package bankingSystem;


public abstract class Account {

    protected int accountNumber;
    protected String accountHolder;
    protected double balance;

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}
