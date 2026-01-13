package ecommercesystem;

public interface Payment {

	public abstract void pay(double amount) throws PaymentFailedException;
}