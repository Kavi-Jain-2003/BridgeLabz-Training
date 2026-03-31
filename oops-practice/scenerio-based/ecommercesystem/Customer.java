package ecommercesystem;

public class Customer {

	private String customerId;
	private String customerName;
	public Customer(String customerId,String customerName)
	{
		this.customerId=customerId;
		this.customerName=customerName;
	}
	public String getCustomerName()
	{
		return customerName;
	}
	public String getCustomerId()
	{
		return customerId;
	}
}
