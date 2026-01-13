package digitalwalletsystem;

public class Wallet {
    User user;
    double balance;

    public Wallet(User user) {
        this.user = user;
        this.balance = 0;
    }

    public void addMoney(double amount) {
        balance += amount;
        System.out.println("Added ₹" + amount + " to " + user.name + "'s wallet. Balance: ₹" + balance);
    }

    public void withdrawMoney(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn ₹" + amount + " from " + user.name + "'s wallet. Balance: ₹" + balance);
    }
}
