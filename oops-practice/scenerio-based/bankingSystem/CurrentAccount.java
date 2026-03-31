package bankingSystem;

public class CurrentAccount extends Account implements BankService {

    public CurrentAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited");
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance to withdraw");
        }
        balance -= amount;
        System.out.println(amount + " withdrawn");
    }

    @Override
    public double calculateInterest() {
        return balance * 0.04;
    }

    public void balanceWithInterest() {
        System.out.println("Balance with interest: " + (balance + calculateInterest()));
    }
}
