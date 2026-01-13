package digitalwalletsystem;
public class Transaction {
    String fromUser;
    String toUser;
    double amount;

    public Transaction(String fromUser, String toUser, double amount) {
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.amount = amount;
    }

    public void showTransaction() {
        System.out.println(fromUser + " transferred ₹" + amount + " to " + toUser);
    }
}
