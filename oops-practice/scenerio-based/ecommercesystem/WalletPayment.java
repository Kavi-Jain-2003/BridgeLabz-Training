package ecommercesystem;

class WalletPayment implements Payment {
	@Override
	public void pay(double amount) throws PaymentFailedException
	{
		if(amount>5000)
		{
		throw new PaymentFailedException("wallet payment failed");
		}
		System.out.println("paid "+amount+" using wallet");
	}

}