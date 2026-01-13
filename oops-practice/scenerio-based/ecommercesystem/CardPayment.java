package ecommercesystem;

public class CardPayment implements Payment{

	@Override
	public void pay(double amount) throws PaymentFailedException
	{
		if(amount>5000)
		{
		throw new PaymentFailedException("card payment failed: limit exceeded");
		}
		System.out.println("paid "+amount+" using card");
	}

}
