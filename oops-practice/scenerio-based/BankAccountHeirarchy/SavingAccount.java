package BankAccountHeirarchy;

class SavingsAccount extends BankAccount {

    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // 0.5% of balance
    @Override
    double calculateFee() {
        return getBalance() * 0.005;
    }
}
