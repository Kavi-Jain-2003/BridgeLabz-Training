import java.util.*;

public class Bank {

    // HashMap: AccountNumber -> Balance
    HashMap<Integer, Double> accounts = new HashMap<>();

    // TreeMap: Balance -> List of AccountNumbers (sorted by balance)
    TreeMap<Double, List<Integer>> balanceSortedMap = new TreeMap<>();

    // Queue for withdrawal requests (AccountNumber, Amount)
    Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    // Add account
    public void addAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);

        balanceSortedMap.putIfAbsent(balance, new ArrayList<>());
        balanceSortedMap.get(balance).add(accountNumber);
    }

    // Queue a withdrawal request
    public void queueWithdrawal(int accountNumber, double amount) {
        withdrawalQueue.add(new WithdrawalRequest(accountNumber, amount));
    }

    // Process withdrawals
    public void processWithdrawals() {
        System.out.println("Processing Withdrawals:");
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest req = withdrawalQueue.remove();
            int acc = req.accountNumber;
            double amount = req.amount;

            if (!accounts.containsKey(acc)) {
                System.out.println("Account " + acc + " does not exist!");
                continue;
            }

            double balance = accounts.get(acc);

            if (amount > balance) {
                System.out.println("Insufficient balance in account " + acc);
                continue;
            }

            // Update balance
            double newBalance = balance - amount;
            accounts.put(acc, newBalance);

            // Update TreeMap: remove old balance
            balanceSortedMap.get(balance).remove((Integer) acc);
            if (balanceSortedMap.get(balance).isEmpty()) {
                balanceSortedMap.remove(balance);
            }

            // Add new balance
            balanceSortedMap.putIfAbsent(newBalance, new ArrayList<>());
            balanceSortedMap.get(newBalance).add(acc);

            System.out.println("Withdrawal of ₹" + amount + " successful from account " + acc);
        }
        System.out.println();
    }

    // Display all accounts (HashMap)
    public void displayAccounts() {
        System.out.println("All Accounts (HashMap - unordered):");
        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            System.out.println("Account " + entry.getKey() + " : ₹" + entry.getValue());
        }
        System.out.println();
    }

    // Display accounts sorted by balance (TreeMap)
    public void displaySortedByBalance() {
        System.out.println("Accounts Sorted by Balance (TreeMap):");
        for (Map.Entry<Double, List<Integer>> entry : balanceSortedMap.entrySet()) {
            for (int acc : entry.getValue()) {
                System.out.println("Account " + acc + " : ₹" + entry.getKey());
            }
        }
        System.out.println();
    }

    // Inner class for withdrawal request
    static class WithdrawalRequest {
        int accountNumber;
        double amount;

        WithdrawalRequest(int accountNumber, double amount) {
            this.accountNumber = accountNumber;
            this.amount = amount;
        }
    }

    public static void main(String[] args) {

        Bank bank = new Bank();

        // Add accounts
        bank.addAccount(101, 5000);
        bank.addAccount(102, 10000);
        bank.addAccount(103, 7500);

        // Display accounts
        bank.displayAccounts();
        bank.displaySortedByBalance();

        // Queue withdrawal requests
        bank.queueWithdrawal(101, 2000);
        bank.queueWithdrawal(102, 12000); // insufficient
        bank.queueWithdrawal(103, 3000);

        // Process withdrawals
        bank.processWithdrawals();

        // Display updated accounts
        bank.displayAccounts();
        bank.displaySortedByBalance();
    }
}

