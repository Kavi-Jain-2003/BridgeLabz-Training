package bankingSystem;

public class OnlineBankingSystem {

    public static void main(String[] args) {

        try {
            SavingsAccount sa = new SavingsAccount(101, "Pooja", 3000);
            sa.checkBalance();
            sa.deposit(2000);
            sa.withdraw(1000);
            sa.balanceWithInterest();

            System.out.println("----------");

            CurrentAccount ca = new CurrentAccount(102, "Riya", 3000);
            ca.checkBalance();
            ca.deposit(2000);
            ca.withdraw(6000);
            ca.balanceWithInterest();

        } catch (InsufficientBalanceException e) {
            System.out.println("Warning: " + e.getMessage());
        }
    }
}
