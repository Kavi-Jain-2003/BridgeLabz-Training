interface Payment {
    void pay(double amount);
}
class UPI implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
class CreditCard implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}
class Wallet implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Wallet");
    }
}
public class DigitalPaymentSystem {

    public static void main(String[] args) {

        Payment upi = new UPI();
        Payment card = new CreditCard();
        Payment wallet = new Wallet();

        upi.pay(500);
        card.pay(1200);
        wallet.pay(300);
    }
}
