package digitalwalletsystem;

public class DigitalWalletSystem {

    public static void main(String[] args) {

        // Users
        User u1 = new User("Rahul");
        User u2 = new User("Anita");

        // Wallets
        Wallet w1 = new Wallet(u1);
        Wallet w2 = new Wallet(u2);

        // Add money
        w1.addMoney(4000);
        w2.addMoney(3000);

        // Transfers
        TransferService bankTransfer = new BankTransfer();
        TransferService walletTransfer = new WalletTransfer();

        try {
            // Bank transfer
            bankTransfer.transfer(w1, w2, 2000);

            // Wallet transfer
            walletTransfer.transfer(w2, w1, 1000);

            // Attempt withdrawal
            w2.withdrawMoney(5000); // Should trigger exception
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        // Transaction example
        Transaction t1 = new Transaction("Rahul", "Anita", 2000);
        t1.showTransaction();

        Transaction t2 = new Transaction("Anita", "Rahul", 1000);
        t2.showTransaction();
    }
}
