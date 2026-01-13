package digitalwalletsystem;

public class BankTransfer implements TransferService {

    @Override
    public void transfer(Wallet from, Wallet to, double amount) throws InsufficientBalanceException {
        if (amount > from.balance) {
            throw new InsufficientBalanceException("Insufficient balance for bank transfer!");
        }
        from.balance -= amount;
        to.balance += amount;
        System.out.println("Bank Transfer: ₹" + amount + " from " + from.user.name + " to " + to.user.name);
    }
}
