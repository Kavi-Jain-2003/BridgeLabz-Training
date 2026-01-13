package digitalwalletsystem;

public class WalletTransfer implements TransferService {

    @Override
    public void transfer(Wallet from, Wallet to, double amount) throws InsufficientBalanceException {
        if (amount > from.balance) {
            throw new InsufficientBalanceException("Insufficient balance for wallet transfer!");
        }
        from.balance -= amount;
        to.balance += amount;
        System.out.println("Wallet Transfer: ₹" + amount + " from " + from.user.name + " to " + to.user.name);
    }
}
