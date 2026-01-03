// Parent class
class BankAccountWithDetails {

    // access modifiers
    public int accountNumber;        // public
    protected String accountHolder;  // protected
    private double balance;          // private

    // constructor
    BankAccountWithDetails(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // public getter for balance
    public double getBalance() {
        return balance;
    }

    // public setter for balance
    public void setBalance(double amount) {
        if (amount >= 0) {
            balance = amount;
        } else {
            System.out.println("Invalid balance amount");
        }
    }

    // deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

// Child class
public class SavingAccount extends BankAccountWithDetails {

    double interestRate;

    // constructor
    SavingAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // method demonstrating protected & public access
    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);      // public
        System.out.println("Account Holder: " + accountHolder);      // protected
        System.out.println("Balance: " + getBalance());              // private via getter
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println();
    }

    public static void main(String[] args) {

        SavingAccount sa =
                new SavingAccount(12345, "Siya Jain", 50000, 4.5);

        sa.displayAccountDetails();

        // modifying balance using public methods
        sa.deposit(10000);
        sa.withdraw(5000);

        System.out.println("Updated Balance after deposit and withdraw: " + sa.getBalance());
    }
}
