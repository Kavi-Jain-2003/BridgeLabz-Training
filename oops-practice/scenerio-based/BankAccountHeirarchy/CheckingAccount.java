package BankAccountHeirarchy;

class CheckingAccount extends BankAccount {

    CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // Flat 1.0 if balance < 1000
    @Override
    double calculateFee() {
        if (getBalance() < 1000) {
            return 1.0;
        }
        return 0.0;
    }
}
