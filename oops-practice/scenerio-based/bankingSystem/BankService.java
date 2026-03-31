package bankingSystem;
public interface BankService {

    void deposit(double amount);

    void withdraw(double amount) throws InsufficientBalanceException;

    double calculateInterest();
}

