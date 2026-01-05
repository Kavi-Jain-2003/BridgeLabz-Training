/*Methods – Bank Account Manager
1. Scenario: A banking app needs to perform operations like deposit, withdraw, and check balance for a user. */

class BankAccount {
    // attributes
    int accountNumber;
    float balance;

    BankAccount(int accountNumber, float balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // deposit
    public void deposit(float depositMoney) {
        balance += depositMoney;
        System.out.println("Deposited successfully");
    }

    // withdraw
    public void withdraw(float witdrawMoney) {
        if (witdrawMoney > balance) {
            System.out.println("insufficient balance");
        } else {
            balance -= witdrawMoney;
            System.out.println("Withdrawal successfully");
        }
    }

    // display details
    public void displayAccountDetails() {
        System.out.println("Account number:" + accountNumber);
        System.out.println("balance:" + balance);
    }
}

public class BankAccountManager {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(1001, 12000);
        b.displayAccountDetails();
        b.deposit(2000);
        b.withdraw(1000);
        b.displayAccountDetails();
    }
}
