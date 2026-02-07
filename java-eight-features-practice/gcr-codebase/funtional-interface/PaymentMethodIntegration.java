interface PaymentProcessor
{
	void pay(double amount);
	default void refund(double amount)
	{
		System.out.println("refund of rs:"+amount+" processed");
	}
}
class UpiPayment implements PaymentProcessor
{
	@Override
	public void pay(double amount)
	{
		System.out.println("Paid rs"+amount+" using UPI");
	}
}
class CreditCardPayment implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Paid rs:" + amount + " using Credit Card");
    }

    // Custom refund logic
    @Override
    public void refund(double amount) {
        System.out.println("Refund of rs:" + amount + " to Credit Card");
    }
}

public class PaymentMethodIntegration {

    public static void main(String[] args) {

        PaymentProcessor upi = new UpiPayment();
        PaymentProcessor card = new CreditCardPayment();

        upi.pay(500);
        upi.refund(200);

        card.pay(1000);
        card.refund(400);
    }
}

