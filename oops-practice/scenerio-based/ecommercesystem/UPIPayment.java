package ecommercesystem;

class UPIPayment implements Payment {

	@Override
	public void pay(double amount) throws PaymentFailedException
	{
		if(amount>5000)
		{
		throw new PaymentFailedException("UPI payment failed");
		}
		System.out.println("paid "+amount+" using UPI");
	}

}

