class BankAccount {
    int balance = 10000;

    boolean withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
            return true;
        }
        return false;
    }

    int getBalance() {
        return balance;
    }
}
